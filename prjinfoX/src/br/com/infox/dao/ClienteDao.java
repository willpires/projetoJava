package br.com.infox.dao;

import br.com.infox.dal.FabricaConexao;
import br.com.infox.model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDao implements ContratoDao<Cliente> {

    PreparedStatement pst;

    @Override
    public int adicionar(Cliente entidade) {
        Connection conexao = FabricaConexao.obterConexao();
        int adicionado = 0;
        String sql = "insert into tbclientes(nomeCli,endCli,foneCli,emailCli) values (?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, entidade.getNome());
            pst.setString(2, entidade.getEndereco());
            pst.setString(3, entidade.getTelefone());
            pst.setString(4, entidade.getEmail());

            adicionado = pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return adicionado;
    }

    @Override
    public boolean remover(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar(int id, Cliente entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
