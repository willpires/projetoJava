package br.com.infox.models;

import br.com.infox.domain.Usuario;
import br.com.infox.connection.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDao implements CrudDao<Usuario> {

    private Connection conexao = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    @Override
    public int adicionar(Usuario usuario) {
        int adicionado = 0;

        this.conexao = FabricaConexao.obterConexao();

        String sql = "insert into tbusuarios(iduser,usuario,fone,login,senha,perfil) values (?,?,?,?,?,?)";
        try {

            pst = conexao.prepareStatement(sql);

            pst.setString(1, usuario.getIdUsuario());
            pst.setString(2, usuario.getUsuario());
            pst.setString(3, usuario.getFone());
            pst.setString(4, usuario.getLogin());
            pst.setString(5, usuario.getSenha());
            pst.setString(6, usuario.getPerfi());
            adicionado = pst.executeUpdate();

            this.conexao.close();

            return adicionado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return adicionado;
    }

    @Override
    public int remover(String idUsuario) {
        int removido = 0;

        this.conexao = FabricaConexao.obterConexao();

        String sql = "delete from tbusuarios where iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, idUsuario);
            removido = pst.executeUpdate();
            
            this.conexao.close();
            
            return removido;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return removido;
    }

    @Override
    public int alterar(Usuario usuario) {
        int adicionado = 0;

        this.conexao = FabricaConexao.obterConexao();

        String sql = "update tbusuarios set usuario=?,Fone=?,login=?,Senha=?,Perfil=?  where iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario.getUsuario());
            pst.setString(2, usuario.getFone());
            pst.setString(3, usuario.getLogin());
            pst.setString(4, usuario.getSenha());
            pst.setString(5, usuario.getPerfi());
            pst.setString(6, usuario.getIdUsuario());
            
            adicionado = pst.executeUpdate();
            
            this.conexao.close();
            
            return adicionado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return adicionado;
    }

    @Override
    public ResultSet consultar(String idUsuario) {

        this.conexao = FabricaConexao.obterConexao();

        String sql = "select * from tbusuarios where iduser=?";

        try {
            //pegando nome do usuario
            pst = conexao.prepareStatement(sql);
            pst.setString(1, idUsuario);
            rs = pst.executeQuery();
            
             this.conexao.close();
            
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

}
