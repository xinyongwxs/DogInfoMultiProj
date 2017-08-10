package management.web.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import management.web.enitity.TrainingDog;
import management.web.repository.TrainingDogRepository;
import management.web.services.DogService;

@Service
public class TrainingDogServiceImpl implements DogService<TrainingDog> {

	@Autowired
	private TrainingDogRepository trainingDogRepository;
	@Override
	public List<TrainingDog> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AddDogs(List<TrainingDog> dogs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateDogs(Map<String, Object> dogProps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TrainingDog> getAllByFilter(Integer limit, Integer offset, Map<String, Object> filter,
			String orderByName, String sortMethod) {
		List<TrainingDog> result = trainingDogRepository.getLimitItems(limit, offset, filter, orderByName, sortMethod);
		return result;
	}

}
