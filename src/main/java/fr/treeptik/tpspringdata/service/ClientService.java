package fr.treeptik.tpspringdata.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.treeptik.tpspringdata.dao.ClientDAO;
import fr.treeptik.tpspringdata.model.Client;

@Service
public class ClientService {
	
	@Autowired
	private ClientDAO clientDAO;

	@Transactional
	public Client save(Client client) {
		return clientDAO.save(client);
	}
	
	public List<Client> findAllByClientName(String clientname, Pageable pageable){
		return clientDAO.findAllByClientName(clientname, pageable);
	}
	
	
	
}
