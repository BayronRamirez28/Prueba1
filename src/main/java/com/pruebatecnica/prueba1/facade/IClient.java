package com.pruebatecnica.prueba1.facade;

import java.util.List;

import com.pruebatecnica.prueba1.model.Client;

public interface IClient {

	public List<Client> findAll();
	
	public void create(Client client);
	
	public void update(Client client);
	
	public void delete(Client client);
	
	public Client findId(int id);
	
}
