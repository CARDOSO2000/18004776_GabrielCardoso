package br.maua.interfaces;

import java.util.List;

public interface Dao <T> {
    List<T> get(String condition);
    List<T> getAll();
    void update(T t);
    void delete(T t);
    void create(T t);
}
