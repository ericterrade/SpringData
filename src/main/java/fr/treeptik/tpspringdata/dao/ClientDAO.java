package fr.treeptik.tpspringdata.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.treeptik.tpspringdata.model.Client;

public interface ClientDAO extends CrudRepository<Client, Integer> {

	Client findByClientName(String clientname);

	@Query("select c from Client c where c.clientName like ?1")
	List<Client> findAllByClientName(String clientname, Pageable pageable);

}
