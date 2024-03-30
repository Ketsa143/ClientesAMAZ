package com.app.web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Nombre", nullable = false, length = 50)
	private String nombre;

	@Column(name = "Apellido", nullable = false, length = 50)
	private String apellido;

	@Column(name = "Email", nullable = false, length = 50, unique = true)
	private String email;

	@Column(name = "Cedula", nullable = false, length = 50, unique = true)
	private String cedula;

	@Column(name = "Celular", nullable = false, length = 50)
	private String celular;

	public Cliente() {

	}

	public Cliente(Long id, String nombre, String apellido, String email, String cedula, String celular) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.cedula = cedula;
		this.celular = celular;
	}

	public Cliente(String nombre, String apellido, String email, String cedula, String celular) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.cedula = cedula;
		this.celular = celular;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", cedula="
				+ cedula + ", celular=" + celular + "]";
	}

}
