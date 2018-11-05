package br.com.infox.connection;

import java.sql.*;

/**
 *
 * @author MARCUS
 */
public final class FabricaConexao {
    // metodo que estabelece a conexao com o banco variavel = conexao metodo = conector 

    private FabricaConexao() {}
    
    public static Connection obterConexao() {
//        java.sql.Connection conexao = null;
        // proxima linha "chama" o driver que eu improtei pra bibliotecas
        String driver = "com.mysql.jdbc.Driver";
        // Armazenando informações referente ao banco 
        String url = "jdbc:mysql://localhost:3306/<nome_banco>";
        String user = "root";
        String password = "";
        // conexão com a porra do banco
        try {
            Class.forName(driver);
            //conexao = DriverManager.getConnection(url, user, password);
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            // linha de baixo é apoio para falar o erro de conexao
           // System.out.println(e);
           throw new RuntimeException();
        }
    }
}
