package com.infosys.realsocial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infosys.realsocial.model.UserProfile;
import com.infosys.realsocial.repository.RSMongoRepository;
import com.infosys.realsocial.repository.RSSearchRepository;

@Controller
public class RSController {

	@Autowired
	RSMongoRepository carRepository;
	
	@Autowired
	RSSearchRepository carSearchRepository;
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("carList", carRepository.findAll());
		return "home";
	}
	
	@RequestMapping(value = "/addCar", method = RequestMethod.POST)
	public String addCar(@ModelAttribute UserProfile car) {
		carRepository.save(car);
		System.out.println(car.toString());
		return "success";
	}
	
	@RequestMapping(value = "/search")
	public String search(Model model, @RequestParam String search) {
		model.addAttribute("carList", carSearchRepository.searchCars(search));
		model.addAttribute("search", search);
		return "home";
	}
	
}
