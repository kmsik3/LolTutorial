package com.example.demo.lower;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterModel, Long>{
	
	
	/*
	 * CharacterModel findCharactersByCharName(String charName); CharacterModel
	 * findById(int id);
	 */

}
