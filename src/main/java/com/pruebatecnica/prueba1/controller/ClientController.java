package com.pruebatecnica.prueba1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.pruebatecnica.prueba1.implement.ClientDao;
import com.pruebatecnica.prueba1.model.Client;


@Controller
@RequestMapping("/clientes")
public class ClientController {

	private final Logger logg= LoggerFactory.getLogger(Client.class);
	
	@Autowired
	private ClientDao clientDao;
	
	@GetMapping("")
	public String indexclient(Model model) {
		model.addAttribute("clientes", clientDao.findAll());
		return "/client/indexclient";

	}
	
	@GetMapping("/create")
	public String create(Model model) {
		model.addAttribute("cliente", new Client());
		return "/client/createclient";
	}
	
	@PostMapping("/save")
	public String save(Client client) {
		logg.info("Información del cliente, {}", client);
		clientDao.create(client);
		return "redirect:/clientes";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		Client cl = clientDao.findId(id);
		logg.info("Objeto llamado }", cl);
		model.addAttribute("cliente", cl);
		return "/client/updateclient";
	}
	
}
