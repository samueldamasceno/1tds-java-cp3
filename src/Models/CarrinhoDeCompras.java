/*  Nome: Felipe Menezes Prometti – RM: 555174
    Nome: Murillo Ari Sant'Anna – RM: 557183
    Nome: Samuel Damasceno - RM: 558876
    Nome: Vitor Isac Belicci - RM: 554686
    Tema sorteado: Ferramentas e construção
*/

package Models;


import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho");
    }

    public void removerProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produtos.remove(produto);
                System.out.println("Produto removido do carrinho!");
                return;
            }
        }
        System.out.println("Esse produto não está no carrinho.");
    }

    public double calcularTotalCompra() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void exibirItens() {
        if (produtos.isEmpty()){
            System.out.println("O carrinho está vazio!");
        }
        else {
            System.out.println("------------------------");
            System.out.println("Itens no carrinho:");
            for (Produto produto : produtos) {
                System.out.println(produto.getNome() + ": R$" + produto.getPreco());
            }
            System.out.println("------------------------");
            System.out.println("O total é de R$" + calcularTotalCompra());
            System.out.println("------------------------");
        }
    }

    public void esvaziarCarrinho() {
        produtos.clear();
        System.out.println("O seu carrinho foi esvaziado!");
    }
}