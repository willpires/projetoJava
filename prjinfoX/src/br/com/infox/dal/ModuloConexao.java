/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author MARCUS
 */
public class ModuloConexao {
    // metodo que estabelece a conexao com o banco variavel = conexao metodo = conector 

    public static Connection conector() {
        java.sql.Connection conexao = null;
        // proxima linha "chama" o driver que eu improtei pra bibliotecas
        String driver = "com.mysql.jdbc.Driver";
        // Armazenando informações referente ao banco 
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        // conexão com a porra do banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // linha de baixo é apoio para falar o erro de conexao
           // System.out.println(e);
            return null;
        }
    }
}