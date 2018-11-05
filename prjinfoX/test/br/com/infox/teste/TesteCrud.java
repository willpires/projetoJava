package br.com.infox.teste;

import br.com.infox.models.ClienteDao;
import br.com.infox.domain.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tomaz
 */
public class TesteCrud {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        ClienteDao clienteDao = new ClienteDao();
        ResultSet resultSet = clienteDao.consultar("Agenor Souza");
        try {
            while (resultSet.next()) {
                cliente.setNome(resultSet.getString("nomecli"));
                cliente.setTelefone(resultSet.getString("fonecli"));
                cliente.setEmail(resultSet.getString("emailcli"));
                cliente.setEndereco(resultSet.getString("endcli"));
            }
            System.out.println(cliente);
        } catch (SQLException ex) {
            Logger.getLogger(TesteCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
