package br.com.infox.contrato;

public interface ContratoCliente {

    interface ViewCliente {

        public void clienteCadastrado(int cadastrado);

        public void dadosAlterado(int atualizado);

        public void clienteRemovido(int removido);

    }

}
