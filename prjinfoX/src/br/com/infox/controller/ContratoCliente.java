/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.controller;

/**
 *
 * @author tomaz
 */
public interface ContratoCliente {

    interface ViewCliente {

//        public void sucessoPesquisa(ResultSet resultSet);
        public void clienteCadastrado(int cadastrado);

        public void dadosAlterado(int atualizado);

        public void clienteRemovido(int removido);

    }

}
