package com.example.demo.lower;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity(name = "Characters")
public class CharacterModel {
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private int id;

	@Column(name = "char_name")
	private String charName;

	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "characterModel")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "char_id", referencedColumnName = "Id")
	private List<AbilityModel> ability;


	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "char_id", referencedColumnName = "Id")
	private List<ItemModel> item;




	public List<ItemModel> getItem() {
		return item;
	}
	public void setItem(List<ItemModel> item) {
		this.item = item;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}

	public List<AbilityModel> getAbility() {
		return ability;
	}

	public void setAbility(List<AbilityModel> ability) {
		this.ability = ability;
	}









}
