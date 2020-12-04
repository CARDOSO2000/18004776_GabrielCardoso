package br.maua.DAO;

import java.util.List;

public interface Dao<T> {
    T get(int condition);
    List<T> getAll();
    void update(T t);
    void delete(T t);
    void create(T t);
}
