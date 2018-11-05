package br.com.infox.contrato;

import java.sql.ResultSet;

public interface CrudContrato<E> {
    int adicionar(E entidade);
    int remover(String id);
    int alterar(E entidade);
    ResultSet consultar(String tipo);
}
