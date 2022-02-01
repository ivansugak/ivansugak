package dao;

import java.util.List;
import java.util.Optional;

public interface Dao <K, T> {

    T save(T entity);

    Optional<T> findById(K id);

    List<T> findAll();

    boolean update(K id, T entity);

    boolean delete(K id);
}