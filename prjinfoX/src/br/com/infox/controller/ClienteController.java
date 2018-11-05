package br.com.infox.controller;

import br.com.infox.contrato.ContratoCliente;
import br.com.infox.models.ClienteDao;
import br.com.infox.domain.Cliente;

public class ClienteController {
    
    ClienteDao clienteDao = new ClienteDao();

    public void adicionar(Cliente cliente, ContratoCliente.ViewCliente viewCliente) {
        int linhasAfetadas = clienteDao.adicionar(cliente);
        viewCliente.clienteCadastrado(linhasAfetadas);
    }
    
    public void remover(String id, ContratoCliente.ViewCliente viewCliente) {
        int linhasAfetadas = clienteDao.remover(id);
        viewCliente.clienteRemovido(linhasAfetadas);
    }
    
    
    public void alterar(Cliente cliente, ContratoCliente.ViewCliente viewCliente) {
        int sucesso = clienteDao.alterar(cliente);
        viewCliente.dadosAlterado(sucesso);
    }

}
