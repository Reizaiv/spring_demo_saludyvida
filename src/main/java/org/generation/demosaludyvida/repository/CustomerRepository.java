package org.generation.demosaludyvida.repository;

import java.util.List;

import org.generation.demosaludyvida.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);

    // email Nombre del atributo
    // Buscar por email a un cliente
    // Optional<Customer> findByEmail(String email);

    // suponiento que tenemos un atributo llamado "active"
    // buscar todos los usuarios que el atributo active = true.
    // Iterable<Customer> findAllByActive(boolean isActive);
    // Iterable<Customer> findAllByActiveTrue();
    // Iterable<Customer> findAllByActiveFalse();

}
