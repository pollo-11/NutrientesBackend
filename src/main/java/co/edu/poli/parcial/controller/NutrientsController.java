package co.edu.poli.parcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.parcial.model.Nutrients;
import co.edu.poli.parcial.repository.NutrientsRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController // Defines that this class is a spring bean
@RequestMapping("/api/v1/")
public class NutrientsController {
	@Autowired
	NutrientsRepository nutrientesRepository;

	@GetMapping("/Nutrients")

	public List<Nutrients> getAllNutrients() {
		return nutrientesRepository.findAll();
	}

	@GetMapping("/Nutrients/{id}")
	public Nutrients getNutrientsByID(@PathVariable String id) {
		return nutrientesRepository.findById(id).get();
	}

	@PostMapping("/Nutrients")
	public Nutrients saveNutrients(@RequestBody Nutrients Nutrients) {
		return nutrientesRepository.save(Nutrients);
	}

	@PostMapping("/NutrientsList")
	public List<Nutrients> saveListNutrients(@RequestBody List<Nutrients> nutrients) {
		return nutrientesRepository.saveAll(nutrients);
	}

	@PutMapping("/Nutrients/{id}")
	public Nutrients updateNutrients(@PathVariable String id, @RequestBody Nutrients Nutrients) {

		Nutrients _Nutrients = nutrientesRepository.findById(id).get();

		_Nutrients.setName(Nutrients.getName());
		_Nutrients.setRda(Nutrients.getRda());
		_Nutrients.setWiki(Nutrients.getWiki());
		_Nutrients.setRequired(Nutrients.isRequired());
		_Nutrients.setType(Nutrients.getType());
		_Nutrients.setTui(Nutrients.getTui());

		nutrientesRepository.save(_Nutrients);

		return _Nutrients;
	}

	@DeleteMapping("/Nutrients/{id}")
	public Nutrients deleteNutrientsById(@PathVariable String id) {
		Nutrients _Nutrients = nutrientesRepository.findById(id).get();
		nutrientesRepository.deleteById(id);
		return _Nutrients;
	}

	@DeleteMapping("/NutrientsList")
	public void deleteAll() {
		nutrientesRepository.deleteAll();
	}

	@GetMapping("/Nutrients/{a}/{b}")
	public List<Nutrients> getfindBooks2(@PathVariable int a, @PathVariable int b) {
		return nutrientesRepository.findNutssQ2(a, b);
	}
}
