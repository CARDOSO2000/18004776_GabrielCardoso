package br.maua.interfaces;

import java.util.List;

/**
 * @author Gabriel Cardoso
 * @param <T>
 * Interface com os metodos para trabalhar com o banco
 */
public interface Dao <T> {
    List<T> get(String condition) throws Exception;
    List<T> getAll();
    void create(T t);
}
