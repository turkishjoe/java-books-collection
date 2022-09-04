package info.nenado.repository;

import info.nenado.entity.DomainObjectInterface;

import java.util.Set;

public interface DataRepositoryInterface<V extends DomainObjectInterface> {
    void persist(V object);
    void delete(V object);
    Set<String> getRandomData();

}