package com.example.demo.lower;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "item")
public class ItemModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private int id;

	@Column(name = "Level")
	private int level;

	@Column(name = "Item")
	private String item;


	@Column(name = "char_id") 
	private int charId;
	
	public ItemModel() {
		
	}
	
	public ItemModel(int id, int level, String item, int charId) {
		this.id = id;
		this.level = level;
		this.item = item;
		this.charId = charId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public int getCharId() {
		return charId;
	}


	public void setCharId(int charId) {
		this.charId = charId;
	}
	
	


}
