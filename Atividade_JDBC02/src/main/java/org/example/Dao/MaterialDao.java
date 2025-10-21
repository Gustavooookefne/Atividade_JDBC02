package org.example.Dao;

import org.example.Infra.Conexao;
import org.example.Model.Material;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MaterialDao {
    public static void inserirMaterial(Material material)throws SQLException{
        String query = """
                INSERT INTO material
                (nome , cnpj) VALUES (?,?)
                """;

        try(Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)){
                stmt.setString(1, material.getNome());
                stmt.setString(2,material.getCnpj());
                stmt.executeUpdate();

        }
    }


}
