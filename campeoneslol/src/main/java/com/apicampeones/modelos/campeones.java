package com.apicampeones.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class campeones implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	//@Column(nullable = false, updatable = false),con esto es para que no se actualice
	
	private Long id;
	private String nombre;
	private String rol;
	private String edad;
	private String imageUrl;
	
	private String numeroCampeon;
	
	
	//Getter and Setters
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
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getNumeroCampeon() {
		return numeroCampeon;
	}
	public void setNumeroCampeon(String numeroCampeon) {
		this.numeroCampeon = numeroCampeon;
	}
	
	@Override
	public String toString() {
		return "campeones [id=" + id + ", nombre=" + nombre + ", rol=" + rol + ", edad=" + edad + ", imageUrl="
				+ imageUrl + ", numeroCampeon=" + numeroCampeon + "]";
	}
	
}
