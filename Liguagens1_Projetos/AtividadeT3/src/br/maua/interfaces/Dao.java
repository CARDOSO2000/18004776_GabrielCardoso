package br.maua.interfaces;

import java.util.List;

public interface Dao <T> {
    List<T> get(String condition) throws Exception;
    List<T> getAll();
    void create(T t);
}
