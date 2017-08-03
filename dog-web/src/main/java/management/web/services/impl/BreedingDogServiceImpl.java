package management.web.services.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import management.web.enitity.BreedingDog;
import management.web.repository.BreedingDogRepository;
import management.web.services.DogService;

@Service
public class BreedingDogServiceImpl implements DogService<BreedingDog> {

	@Resource
	private BreedingDogRepository breedingDogRepository;
	
	@Override
	@Transactional
	public List<BreedingDog> getAll() {
		return breedingDogRepository.findAll();
	}

	@Override
	@Transactional
	public void AddDogs(List<BreedingDog> dogs) {
		breedingDogRepository.save(dogs);
	}

	@Override
	@Transactional
	public void UpdateDogs(Map<String, Object> dogProps) {
		// TODO Auto-generated method stub
		
	}

}
