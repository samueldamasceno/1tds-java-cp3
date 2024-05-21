package Models;

import Models.Enums.CategoriaProduto;

import java.util.ArrayList;

public class ItensDisponiveis {
    private ArrayList<Produto> produtosDisponiveis;

    public ItensDisponiveis() {
        produtosDisponiveis = new ArrayList<>();

        produtosDisponiveis.add(new Produto("Martelo", 40.00, CategoriaProduto.FERRAMENTAS_MANUAIS, "MODELO A"));
        produtosDisponiveis.add(new Produto("Parafusadeira", 169.50, CategoriaProduto.PARAFUSADEIRA_ELETRICA, "MODELO B"));
        produtosDisponiveis.add(new Produto("Trena", 29.90, CategoriaProduto.FERRAMENTAS_DE_MEDICAO, "MODELO C"));
        produtosDisponiveis.add(new Produto("Chave de fenda", 24.30, CategoriaProduto.FERRAMENTAS_MANUAIS, "MODELO D"));
        produtosDisponiveis.add(new Produto("Marreta", 149.90, CategoriaProduto.FERRAMENTAS_MANUAIS, "MODELO E"));
        produtosDisponiveis.add(new Produto("Caixa de Ferramenta", 345.30, CategoriaProduto.ORGANIZADOR_DE_FERRAMENTAS, "MODELO F"));
        produtosDisponiveis.add(new Produto("Serra elétrica", 800.50, CategoriaProduto.FERRAMENTAS_ELETRICAS, "MODELO G"));
        produtosDisponiveis.add(new Produto("Luzes LED Coloridas", 700.00, CategoriaProduto.ILUMINACAO, "MODELO H"));
    }

    public ArrayList<Produto> getProdutos() {
        return produtosDisponiveis;
    }

}