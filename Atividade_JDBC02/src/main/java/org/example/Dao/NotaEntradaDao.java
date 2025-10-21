package org.example.Dao;

import org.example.Model.NotaEntrada;

import java.util.ArrayList;
import java.util.List;

public class NotaEntradaDao{


    private static List<NotaEntrada> notas = new ArrayList<>();
    private static Long proximoIdNota = 1L;

    public NotaEntrada salvar(NotaEntrada nota) {


        nota.setId(proximoIdNota++);
        notas.add(nota);
        System.out.println("   [DAO] Persistindo NotaEntrada (ID: " + nota.getId() + ") na tabela 'NotaEntrada'.");


        for (NotaEntradaItem item : nota.getItens()) {

            System.out.println("   [DAO] Persistindo item: Material ID " + item.getIdMaterial() + " x" + item.getQuantidade() + " na tabela 'NotaEntradaItem'.");
        }

        return nota;
    }


    public boolean fornecedorExiste(Long idFornecedor) {

        boolean existe = idFornecedor != null && idFornecedor > 0 && idFornecedor != 99L;
        if (existe) {
            System.out.println("   [DAO] Fornecedor ID " + idFornecedor + ": Encontrado.");
        } else {
            System.out.println("   [DAO] Fornecedor ID " + idFornecedor + ": NÃO Encontrado.");
        }
        return existe;
    }


    public void atualizarEstoqueMaterial(Long idMaterial, int quantidade) {

        System.out.println("   [DAO] Executando UPDATE Material para ID " + idMaterial + ": Estoque aumentado em: +" + quantidade);
    }
}
