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
    private Marca marca;
    private String descricao;
    private DetalhesTecnicos detalhesTecnicos;
    private String informacoesAdicionais;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, CategoriaProduto categoria, String modelo) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.modelo = modelo;
    }

    public Produto(String nome, double preco, CategoriaProduto categoria, String modelo, Marca marca, String descricao, DetalhesTecnicos detalhesTecnicos, String informacoesAdicionais) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public DetalhesTecnicos getDetalhesTecnicos() {
        return detalhesTecnicos;
    }

    public void setDetalhesTecnicos(DetalhesTecnicos detalhesTecnicos) {
        this.detalhesTecnicos = detalhesTecnicos;
    }

    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }
}
