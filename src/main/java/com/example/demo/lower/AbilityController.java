package com.example.demo.lower;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AbilityController {
	
	@Autowired
	private CharacterRepository characterRepository;
	
	@RequestMapping(value = "/find/{charName}", method = RequestMethod.GET)
	public @ResponseBody List<CharacterModel> findCharacter(@RequestParam String charName) {
				
		List<CharacterModel> characterModel = new ArrayList<CharacterModel>();
		//System.out.println("Please works");
		characterModel = characterRepository.findAll();
		//System.out.println("Please works2");
		return characterModel;
	}
}
