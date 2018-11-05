package br.com.infox.utils;

import br.com.infox.controller.ClienteController;
import br.com.infox.domain.Bos;
import br.com.infox.domain.Cliente;
import br.com.infox.domain.Usuario;

import br.com.infox.models.BosDao;
import br.com.infox.models.ClienteDao;
import br.com.infox.models.UsuarioDao;

public final class DependenciaFactory {

    private static ClienteDao clienteDao = null;
    private static UsuarioDao usuarioDao = null;
    private static BosDao bosDao = null;
    
    private static Cliente cliente = null;
    private static Usuario usuario = null;
    private static Bos bos = null;
    
    private static ClienteController clienteController = null;

    private DependenciaFactory() {
    }
    
    public static ClienteController obterInstanciaClienteController() {
        if (clienteController == null) {
            clienteController = new ClienteController();
        }
        return clienteController;
    }

    public static ClienteDao obterInstanciaClienteDao() {
        if (clienteDao == null) {
            clienteDao = new ClienteDao();
        }
        return clienteDao;
    }

    public static UsuarioDao obterInstanciaUsuarioDao() {
        if (usuarioDao == null) {
            usuarioDao = new UsuarioDao();
        }
        return usuarioDao;
    }

    public static BosDao obterInstanciaBosDao() {
        if (bosDao == null) {
            bosDao = new BosDao();
        }
        return bosDao;
    }
    
    public static Cliente obterInstanciaCliente() {
        if (cliente == null) {
            cliente = new Cliente();
        }
        return cliente;
    }

    public static Usuario obterInsanciaUsuario() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }

    public static Bos obterInstanciaBos() {
        if (bos == null) {
            bos = new Bos();
        }
        return bos;
    }

}
