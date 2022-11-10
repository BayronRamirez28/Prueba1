package com.pruebatecnica.prueba1.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.prueba1.facade.IClient;
import com.pruebatecnica.prueba1.model.Client;
import com.pruebatecnica.prueba1.repository.ClientRepository;

@Service
public class ClientDao implements IClient {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List<Client> findAll() {
		return this.clientRepository.findAll();
	}

	@Override
	public void create(Client client) {
		this.clientRepository.save(client);

	}

	@Override
	public void update(Client client) {
		this.clientRepository.save(client);

	}

	@Override
	public void delete(Client client) {
		this.clientRepository.delete(client);

	}

	@Override
	public Client findId(int id) {
		return this.clientRepository.getOne(id);
	}

}
