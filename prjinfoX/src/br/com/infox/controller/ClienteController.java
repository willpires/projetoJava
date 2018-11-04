package br.com.infox.controller;

import br.com.infox.dao.ClienteDao;
import br.com.infox.model.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author williamjosepires
 */
public class ClienteController {

    public void pesquisarCliente(String pesquisar, ContratoCliente.ViewCliente view) {
        Cliente cliente = new Cliente();
        ClienteDao clienteDao = new ClienteDao();
        ResultSet resultSet = clienteDao.pesquisar("Agenor Souza");
        try {
            while (resultSet.next()) {
                cliente.setNome(resultSet.getString("nomecli"));
                cliente.setTelefone(resultSet.getString("fonecli"));
                cliente.setEmail(resultSet.getString("emailcli"));
                cliente.setEndereco(resultSet.getString("endcli"));
            }
            System.out.println(cliente);
            view.sucessoPesquisa(resultSet);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
