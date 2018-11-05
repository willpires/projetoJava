package br.com.infox.models;

import br.com.infox.connection.FabricaConexao;
import br.com.infox.domain.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDao implements CrudDao<Cliente> {

    private PreparedStatement pst;
    private Connection conexao = null;

    @Override
    public int adicionar(Cliente cliente) {
        this.conexao = FabricaConexao.obterConexao();
        int adicionado = 0;
        String sql = "insert into tbclientes(nomeCli,endCli,foneCli,emailCli) values (?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEndereco());
            pst.setString(3, cliente.getTelefone());
            pst.setString(4, cliente.getEmail());
            adicionado = pst.executeUpdate();
            conexao.close();
            return adicionado;
        } catch (SQLException e) {
            System.err.print("Falha ao tentar adicionar: " + e.getMessage());

        }
        return adicionado;
    }

    @Override
    public int remover(String id) {
        int adicionado = 0;
        this.conexao = FabricaConexao.obterConexao();
        String sql = "delete from tbclientes where idCli = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, id);
            adicionado = pst.executeUpdate();
            conexao.close();
            return adicionado;
        } catch (SQLException e) {
            System.err.print("Falha ao tentar remover: " + e.getMessage());
        }
        return adicionado;
    }

    @Override
    public int alterar(Cliente cliente) {
        int adicionado = 0;
        this.conexao = FabricaConexao.obterConexao();
        String sql = "update tbclientes set nomecli=?,endcli=?,fonecli=?,emailcli=? where idcli=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEndereco());
            pst.setString(3, cliente.getTelefone());
            pst.setString(4, cliente.getEmail());
            pst.setString(5, cliente.getIdCliente());
            adicionado = pst.executeUpdate();
            conexao.close();
            return adicionado;

        } catch (SQLException e) {
            System.err.print("Falha ao tentar alterar: " + e.getMessage());
        }
        return adicionado;
    }

    @Override
    public ResultSet consultar(String pesquisa) {
        ResultSet rs = null;
        this.conexao = FabricaConexao.obterConexao();
        String sql = "select * from tbclientes where nomeCli like ?";
        try {
            pst = conexao.prepareStatement(sql);
            // passando o conteudo da caixa de pesquisa para o ?
            ////"%" é continuaçao do comando sql
            pst.setString(1, pesquisa + "%");
            rs = pst.executeQuery();
            conexao.close();
            return rs;

        } catch (SQLException e) {
            System.err.print("Falha ao tentar pesquisar: " + e.getMessage());
        }
        return rs;
    }

}
