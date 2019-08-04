package me.sebemsomi.domain.repository;

public interface IRepo <T, ID> {

    T create(T t);

    T read(ID id);

    T update(T t);

    void delete(ID id);

}
