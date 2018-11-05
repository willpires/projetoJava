package br.com.infox.controller;

import br.com.infox.contrato.ContratoCliente;
import br.com.infox.models.ClienteDao;
import br.com.infox.domain.Cliente;
import br.com.infox.utils.DependenciaFactory;

public class ClienteController {
    
    private ClienteDao clienteDao = DependenciaFactory.obterInstanciaClienteDao();

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
