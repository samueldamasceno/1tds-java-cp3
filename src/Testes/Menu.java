/*  Nome: Felipe Menezes Prometti – RM: 555174
    Nome: Murillo Ari Sant'Anna – RM: 557183
    Nome: Samuel Damasceno - RM: 558876
    Nome: Vitor Isac Belicci - RM: 554686
    Tema sorteado: Ferramentas e construção
*/

package Testes;

import Models.CarrinhoDeCompras;
import Models.Produto;
import Models.ItensDisponiveis;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static final CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executar = true;
        while (executar) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            /* o scanner não estava funcionando, então vimos na internet que uma possível solução seria
            passarmos o scanner como um parâmetro ;) */

            if (opcao == 1) {
                exibirItensDisponiveis();
                System.out.println("Digite ENTER para continuar");
                scanner.nextLine();
            } else if (opcao == 2) {
                adicionarProduto(scanner);
                System.out.println("Digite ENTER para continuar");
                scanner.nextLine();
            } else if (opcao == 3) {
                removerProduto(scanner);
                System.out.println("Digite ENTER para continuar");
                scanner.nextLine();
            } else if (opcao == 4) {
                esvaziarCarrinho();
                System.out.println("Digite ENTER para continuar");
                scanner.nextLine();
            } else if (opcao == 5) {
                exibirCarrinho();
                System.out.println("Digite ENTER para continuar");
                scanner.nextLine();
            } else if (opcao == 6) {
                System.out.println("Esperamos ter ajudado! Até a próxima!");
                executar = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }

    }

    private static void exibirMenu() {
        System.out.println("------ MENU -----");
        System.out.println("1. Ver itens disponíveis");
        System.out.println("2. Adicionar produto ao carrinho");
        System.out.println("3. Remover produto do carrinho");
        System.out.println("4. Esvaziar carrinho");
        System.out.println("5. Exibir itens do carrinho");
        System.out.println("6. Sair");
        System.out.print("Digite o número da opção desejada: ");
    }

    private static void exibirItensDisponiveis() {
        ItensDisponiveis itensDisponiveis = new ItensDisponiveis();
        ArrayList<Produto> produtosDisponiveis = itensDisponiveis.getProdutos();

        System.out.println("Itens Disponíveis:");
        int contador = 1;
        for(Produto produto : produtosDisponiveis) {
            System.out.println("PRODUTO NÚMERO " + contador);
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("Modelo: " + produto.getModelo());
            System.out.println();
            contador++;
        };
    }

    private static void adicionarProduto(Scanner scanner) {
        ItensDisponiveis itensDisponiveis = new ItensDisponiveis();
        ArrayList<Produto> produtosDisponiveis = itensDisponiveis.getProdutos();

        System.out.println("Produtos Disponíveis:");
        exibirItensDisponiveis();

        System.out.print("Digite o número do produto que deseja adicionar ao carrinho: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice >= 1 && indice <= produtosDisponiveis.size()) {
            Produto produtoEscolhido = produtosDisponiveis.get(indice - 1);
            carrinho.adicionarProduto(produtoEscolhido);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private static void removerProduto(Scanner scanner) {
        exibirCarrinho();
        System.out.print("Digite o número do produto que deseja remover do carrinho: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Produto> itensNoCarrinho = (ArrayList<Produto>) carrinho.getProdutos();

        if (indice >= 1 && indice <= itensNoCarrinho.size()) {
            Produto produtoRemovido = itensNoCarrinho.remove(indice - 1);
            carrinho.removerProduto(produtoRemovido);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private static void esvaziarCarrinho() {
        carrinho.esvaziarCarrinho();
        System.out.println("Carrinho esvaziado!");
    }

    public static void exibirCarrinho() {
        carrinho.exibirItens();
    }

    private static void exibirDetalhesProduto(Produto produto) {
        System.out.println("Detalhes do Produto:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("Modelo: " + produto.getModelo());
        System.out.println("Marca: " + produto.getMarca());
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Detalhes Técnicos: " + produto.getDetalhesTecnicos());
        System.out.println("Informações Adicionais: " + produto.getInformacoesAdicionais());
    }

    /*
    private static void fazerPergunta(Scanner scanner) {
        System.out.print("Digite sua pergunta: ");
        String pergunta = scanner.nextLine();
        produto.adicionarPergunta(pergunta);
        System.out.println("Pergunta adicionada com sucesso!");
    }

    private static void cadastrarSugestao(Scanner scanner) {
        System.out.print("Digite sua sugestão: ");
        String sugestao = scanner.nextLine();
        produto.fazerSugestao(sugestao);
        System.out.println("Sugestão adicionada com sucesso!");
    }

    private static void fazerAvaliacao(Scanner scanner) {
        System.out.print("Digite uma nota de 1 a 10: ");
        int nota = scanner.nextInt();
        produto.avaliacao(nota);
        System.out.println("Avaliação adicionada com sucesso!");
    }
    */
}
