package org.example.Dao;

import org.example.Infra.Conexao;
import org.example.Model.Fornecedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedorDao {
        public boolean cnpj (String cnpj) throws SQLException{
            String query = """
                    SELECT cnpj
                    FROM Fornecedor
                    WHERE cnpj = ?
                    """;
            try(Connetion conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
                stmt.setString(1,fornecedor.getNome());
                stmt.setString(2,fornecedor.getCnpj());
            }
    }
}
