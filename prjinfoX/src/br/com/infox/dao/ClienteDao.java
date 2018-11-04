package br.com.infox.dao;

import br.com.infox.dal.FabricaConexao;
import br.com.infox.model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDao implements CrudDao<Cliente> {

    PreparedStatement pst;
    ResultSet rs = null;
    Connection conexao = FabricaConexao.obterConexao();

    @Override
    public int adicionar(Cliente cliente) {
        String sql = "insert into tbclientes(nomeCli,endCli,foneCli,emailCli) values (?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEndereco());
            pst.setString(3, cliente.getTelefone());
            pst.setString(4, cliente.getEmail());

            return pst.executeUpdate();
        } catch (SQLException e) {
            System.err.print("Falha ao tentar adicionar: " + e.getMessage());

        }
        return 0;
    }

    @Override
    public int remover(String id) {
        String sql = "delete from tbclientes where idCli = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, id);
            return pst.executeUpdate();
        } catch (SQLException e) {
            System.err.print("Falha ao tentar remover: " + e.getMessage());
        }
        return 0;
    }

    @Override
    public int alterar(String id, Cliente cliente) {
        String sql = "update tbclientes set nomecli=?,endcli=?,fonecli=?,emailcli=? where idcli=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEndereco());
            pst.setString(3, cliente.getTelefone());
            pst.setString(4, cliente.getEmail());
            pst.setInt(5, cliente.getIdCliente());

            return pst.executeUpdate();

        } catch (SQLException e) {
            System.err.print("Falha ao tentar alterar: " + e.getMessage());
        }
        return 0;
    }

    @Override
    public ResultSet pesquisar(String pesquisa) {
        String sql = "select * from tbclientes where nomeCli like ?";
        try {
            pst = conexao.prepareStatement(sql);
            // passando o conteudo da caixa de pesquisa para o ?
            ////"%" é continuaçao do comando sql
            pst.setString(1, pesquisa + "%");
            rs = pst.executeQuery();
            return rs;

        } catch (SQLException e) {
            System.err.print("Falha ao tentar pesquisar: " + e.getMessage());
        }
        return rs;
    }

}
