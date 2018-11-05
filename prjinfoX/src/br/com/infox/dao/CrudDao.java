package br.com.infox.dao;

import java.sql.ResultSet;

public interface CrudDao<E> {
    int adicionar(E entidade);
    int remover(String id);
    int alterar(E entidade);
    ResultSet consultar(String tipo);
}
