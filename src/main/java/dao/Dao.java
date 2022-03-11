package dao;

import entity.User;

import java.util.List;

public interface Dao <K, T> {

    T save(T entity);

    T findById(K id);

    List<T> findAll();

    boolean update(K id, T entity);

    boolean delete(K id);
}