package org.example.Model;

public class NotaEntrada {

    private int id;
    Fornecedor fornecedor;
    private String dataEntrega;

    public NotaEntrada(int id, Fornecedor fornecedor, String dataEntrega) {
        this.id = id;
        this.fornecedor = fornecedor;
        this.dataEntrega = dataEntrega;
    }

    public NotaEntrada(Fornecedor fornecedor ,String dataEntrega){
        this.fornecedor = fornecedor;
        this.dataEntrega = dataEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }


}
