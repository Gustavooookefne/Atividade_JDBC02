package org.example.Dao;

import org.example.Infra.Conexao;
import org.example.Model.Fornecedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedorDao {
    public static void inserirFornecedor(Fornecedor fornecedor) throws SQLException{
        String query = """
                INSERT INTO fornecedor
                (nome ,unidade ,estoque) VALUES (?,?,?)
                """;

        try(Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1,fornecedor.getNome());
            stmt.setString(2,fornecedor.getUnidade());
            stmt.setString(3,fornecedor.getEstoque());
            stmt.executeUpdate();
        }
    }
}
