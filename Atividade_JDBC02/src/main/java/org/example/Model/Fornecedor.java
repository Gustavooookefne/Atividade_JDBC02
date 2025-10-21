package org.example.Model;

public class Fornecedor {
    private int id;
    private String nome;
    private String unidade;
    private String estoque;

    public Fornecedor(int id ,String nome ,String unicade ,String estoque){
        this.id = id;
        this.nome = nome;
        this.unidade = unidade;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public Fornecedor(String nome , String unidade , String estoque){
        this.nome = nome;
        this.unidade = unidade;
        this.estoque = estoque;
    }


}


