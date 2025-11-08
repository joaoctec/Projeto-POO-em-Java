package br.com.delivery;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// ===== ENUM =====
enum StatusPedido { PENDENTE, PAGO, ENTREGUE }

// ===== DOMÍNIO =====
class Produto {
    String nome;
    BigDecimal preco;
    Produto(String nome, BigDecimal preco) {
        if (preco.signum() < 0) throw new IllegalArgumentException("Preço inválido");
        this.nome = nome; this.preco = preco;
    }
}

class ItemPedido {
    Produto produto;
    int qtd;
    BigDecimal precoSnapshot;
    ItemPedido(Produto p, int qtd) {
        if (qtd <= 0) throw new IllegalArgumentException("Qtd inválida");
        this.produto = p; this.qtd = qtd;
        this.precoSnapshot = p.preco;
    }
    BigDecimal subtotal() { return precoSnapshot.multiply(BigDecimal.valueOf(qtd)); }
}

class Usuario {
    String nome;
    Usuario(String nome) { this.nome = nome; }
}

class Pedido {
    Usuario usuario;
    List<ItemPedido> itens = new ArrayList<>();
    StatusPedido status = StatusPedido.PENDENTE;
    BigDecimal valorTotal = BigDecimal.ZERO;

    Pedido(Usuario u) { this.usuario = u; }

    void adicionarItem(ItemPedido item) {
        itens.add(item);
        calcularTotal();
    }

    void calcularTotal() {
        valorTotal = itens.stream()
                .map(ItemPedido::subtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    void atualizarStatus(StatusPedido novo) {
        if (status == StatusPedido.ENTREGUE) throw new RuntimeException("Pedido já finalizado");
        status = novo;
    }
}

// ===== PAGAMENTO =====
abstract class Pagamento {
    BigDecimal valor;
    Pagamento(BigDecimal v) { this.valor = v; }
    abstract boolean processar();
}

class PagamentoPix extends Pagamento {
    String chave;
    PagamentoPix(BigDecimal v, String chave) { super(v); this.chave = chave; }
    @Override boolean processar() { return chave != null && !chave.isBlank(); }
}

class PagamentoCartao extends Pagamento {
    String numero;
    PagamentoCartao(BigDecimal v, String numero) { super(v); this.numero = numero; }
    @Override boolean processar() { return numero.length() >= 4; }
}

// ===== MAIN =====
public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("João");
        Pedido pedido = new Pedido(u);

        pedido.adicionarItem(new ItemPedido(new Produto("Burger", new BigDecimal("25.00")), 2));
        pedido.adicionarItem(new ItemPedido(new Produto("Batata", new BigDecimal("10.00")), 1));

        System.out.println("Total: R$ " + pedido.valorTotal);

        Pagamento pagamento = new PagamentoPix(pedido.valorTotal, "joao@pix");
        if (pagamento.processar()) {
            pedido.atualizarStatus(StatusPedido.PAGO);
            System.out.println("Pagamento aprovado!");
        }

        pedido.atualizarStatus(StatusPedido.ENTREGUE);
        System.out.println("Pedido entregue. Status final: " + pedido.status);
    }
}
