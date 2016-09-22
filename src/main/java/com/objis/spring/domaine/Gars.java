package com.objis.spring.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gars {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String surnom;

	public Gars(int id, String nom, String prenom, String surnom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.surnom=surnom;
	}

	public Gars(String nom, String prenom, String surnom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.surnom=surnom;
	}

	public String getSurnom() {
		return surnom;
	}

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

	public Gars() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
