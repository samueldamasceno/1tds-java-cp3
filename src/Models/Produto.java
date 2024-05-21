/*  Nome: Felipe Menezes Prometti – RM: 555174
    Nome: Murillo Ari Sant'Anna – RM: 557183
    Nome: Samuel Damasceno - RM: 558876
    Nome: Vitor Isac Belicci - RM: 554686
    Tema sorteado: Ferramentas e construção
*/

package Models;

import Models.Enums.CategoriaProduto;

public class Produto {
    protected String nome;
    protected double preco;
    private CategoriaProduto categoria;
    private String modelo;
    private String marca;
    private String descricao;
    private String detalhesTecnicos;
    private String informacoesAdicionais;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, String modelo, String marca, String descricao, String detalhesTecnicos, String informacoesAdicionais) {
        this.nome = nome;
        this.preco = preco;
        this.modelo = modelo;
        this.marca = marca;
        this.descricao = descricao;
        this.detalhesTecnicos = detalhesTecnicos;
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<=0)
            System.out.print("Valor invalido");
        else
            this.preco = preco;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDetalhesTecnicos() {
        return detalhesTecnicos;
    }

    public void setDetalhesTecnicos(String detalhesTecnicos) {
        this.detalhesTecnicos = detalhesTecnicos;
    }

    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }
}
