package org.example.Dao;

import org.example.Model.Material;

import java.sql.Connection;
import java.sql.SQLException;

public class MaterialDao {
    public static void inserirMaterial(Material material)throws SQLException{
        String query = """
                INSERT INTO material
                (nome , cnpj) VALUES (?,?)
                """;

        try(Connection conn = Conexao)
    }

}
