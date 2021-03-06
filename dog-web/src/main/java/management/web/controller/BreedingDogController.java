package management.web.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import management.web.enitity.BreedingDog;
import management.web.model.DogFilterModel;
import management.web.services.impl.BreedingDogServiceImpl;


@RestController
@RequestMapping(value = "/breedingdog")
public class BreedingDogController {
	@Autowired
	public BreedingDogServiceImpl breedingDogService;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<BreedingDog> getAll() {
		List<BreedingDog> wdList = breedingDogService.getAll();
		return wdList;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String AddDogs(@RequestBody List<BreedingDog> dogs) {
		if (dogs.size() > 0) {
			breedingDogService.AddDogs(dogs);
		}
		return null;
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void updateDog(@RequestBody Map<String, Object> dogProps) {
		breedingDogService.UpdateDogs(dogProps);
	}
	
	@RequestMapping(value = "/filtered", method = RequestMethod.POST)
	public @ResponseBody List<BreedingDog> getAllByFilter(@RequestBody DogFilterModel filterObj) {
		List<BreedingDog> result = breedingDogService.getAllByFilter(filterObj.getLimit(), 
				filterObj.getOffset(), filterObj.getFilter(), filterObj.getOrderByName(), filterObj.getSortMethod());
		return result;
	}
}
