package com.example.demo.lower;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity(name = "ability")
public class AbilityModel {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private int id;

	@Column(name = "Level")
	private int level;

	@Column(name = "Skill")
	private String skill;


	@Column(name = "char_id") 
	private int charId;


	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name ="char_id") private CharacterModel characterModel;
	 */

	public AbilityModel() {

	}

	public AbilityModel(int level, String skill, int charId) {
		this.level = level;
		this.skill = skill;
		this.charId = charId;

	}

	public int getCharId() {
		return charId;
	}

	public void setCharId(int charId) {
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

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}






}
