/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tomaz
 */
public class TesteConexao {
    
    public static void main(String[] args) {
        Connection con = FabricaConexao.obterConexao();
        System.out.println("Conexão aberta");
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TesteConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
