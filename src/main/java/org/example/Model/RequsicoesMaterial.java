package org.example.Model;

public class RequsicoesMaterial {
    private int id;
    private String setor;
    private String dataSolicitada;
    private RequsicoesMaterial status;

    public RequsicoesMaterial(int id , String setor , String dataSolicitada ,RequsicoesMaterial status){
        this.id = id;
        this.setor = setor;
        this.dataSolicitada = dataSolicitada;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDataSolicitada() {
        return dataSolicitada;
    }

    public void setDataSolicitada(String dataSolicitada) {
        this.dataSolicitada = dataSolicitada;
    }

    public RequsicoesMaterial getStatus() {
        return status;
    }

    public void setStatus(RequsicoesMaterial status) {
        this.status = status;
    }

    public RequsicoesMaterial(String setor , String dataSolicitada , RequsicoesMaterial status){
        this.setor = setor;
        this.dataSolicitada = dataSolicitada;
        this.status = status;
    }
}
