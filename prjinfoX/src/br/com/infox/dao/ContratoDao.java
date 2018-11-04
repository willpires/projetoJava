package br.com.infox.dao;

import java.util.List;

public interface ContratoDao<E> {
    boolean inserir(E entidade);
    boolean remover(int id);
    boolean alterar(int id, E entidade);
    List<E> consultar(int id);
}
