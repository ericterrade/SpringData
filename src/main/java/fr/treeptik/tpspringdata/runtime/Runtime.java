package fr.treeptik.tpspringdata.runtime;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import fr.treeptik.tpspringdata.model.Client;
import fr.treeptik.tpspringdata.service.ClientService;

public class Runtime {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");
		
		ClientService clientService = (ClientService) context
				.getBean("clientService");
		
		Client c1 = new Client(null,"Eric");
		clientService.save(c1);
		Client c2 = new Client(null,"Jean-Paul");
		clientService.save(c2);
		Client c3 = new Client(null,"Lucien");
		clientService.save(c3);
		Client c4 = new Client(null,"Eric");
		clientService.save(c4);
		
		int page = 2;
	    int pageSize = 10;

	    Pageable pageable = new PageRequest(page, pageSize);
	    List<Client> clientList = clientService.findAllByClientName("Er%", pageable);
	    for(Client c : clientList){
	    	System.out.println(c.getId() + " " + c.getClientName());
	    }
	}

}
