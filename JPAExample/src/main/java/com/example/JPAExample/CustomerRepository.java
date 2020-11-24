package com.example.JPAExample;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long>
{
    List<Customer> findByFirstName (String firstname);
    List<Customer> findByLastName(String lastname);
    Customer findById(long id);

}
