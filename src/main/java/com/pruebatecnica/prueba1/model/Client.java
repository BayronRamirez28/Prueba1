package com.pruebatecnica.prueba1.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")

public class Client implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name = "nombres", length = 50)
	private String name;
	
	@Column(name = "apellidos", length = 50)
	private String lastname;
	
	@Column(name = "fecha_de_nacimiento")
	private Date birthdate;
	
	@Column(name = "ciudad", length = 50)
	private String city;
	
	@Column(name = "correo_electronico", length = 80)
	private String email;
	
	@Column(name = "telefono")
	private long telephone;
	
	@Column(name = "ocupacion", length = 50)
	private String occupation;
	
	@Column(name = "viabilidad", length = 50)
	private String viability;

	public Client() {
		super();
	}

	public Client(int id, String name, String lastname, Date birthdate, String city, String email, long telephone,
			String occupation, String viability) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.city = city;
		this.email = email;
		this.telephone = telephone;
		this.occupation = occupation;
		this.viability = viability;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getViability() {
		return viability;
	}

	public void setViability(String viability) {
		this.viability = viability;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", lastname=" + lastname + ", birthdate=" + birthdate + ", city="
				+ city + ", email=" + email + ", telephone=" + telephone + ", occupation=" + occupation + ", viability="
				+ viability + "]";
	}

	

	
	
	
}
