package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

}
//Nasz interfejs nie wprowadza żadnych własnych metod. Udostępnia jedynie te, które są standardowo dostępne w interfejsie CrudRepository.
