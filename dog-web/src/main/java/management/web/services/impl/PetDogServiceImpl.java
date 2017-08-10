package management.web.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import management.web.enitity.PetDog;
import management.web.enitity.TrainingDog;
import management.web.repository.PetDogRepository;
import management.web.services.DogService;

@Service
public class PetDogServiceImpl implements DogService<PetDog> {
	@Autowired
	private PetDogRepository petDogRepository;
	@Override
	@Transactional
	public List<PetDog> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void AddDogs(List<PetDog> dogs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void UpdateDogs(Map<String, Object> dogProps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<PetDog> getAllByFilter(Integer limit, Integer offset, Map<String, Object> filter, String orderByName,
			String sortMethod) {
		List<PetDog> result = petDogRepository.getLimitItems(limit, offset, filter, orderByName, sortMethod);
		return result;
	}

}
