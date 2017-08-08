package management.web.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import management.web.enitity.WorkingDog;
import management.web.repository.WorkingDogRepository;
import management.web.services.DogService;

public class WorkingDogServiceImpl implements DogService<WorkingDog> {
	
	@Autowired
	private WorkingDogRepository workingDogRepository;
	
	@Override
	public List<WorkingDog> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AddDogs(List<WorkingDog> dogs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateDogs(Map<String, Object> dogProps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<WorkingDog> getAllByFilter(Integer limit, Integer offset, Map<String, Object> filter,
			String orderByName, String sortMethod) {
		List<WorkingDog> result = workingDogRepository.getLimitItems(limit, offset, filter, orderByName, sortMethod);
		return result;
	}

}
