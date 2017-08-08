package management.web.repository.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import management.web.enitity.TrainingDog;
import management.web.repository.CustomRepository;
import management.web.repository.common.DogCommonDao;

public class TrainingDogRepositoryImpl implements CustomRepository<TrainingDog> {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<TrainingDog> getLimitItems(Integer limit, Integer offset, Map<String, Object> filter,
			String orderByName, String sortMethod) {
		DogCommonDao<TrainingDog> dd = new DogCommonDao<TrainingDog>(){};
		List<TrainingDog> result = dd.getLimitItems(limit, offset, filter, orderByName, sortMethod, em);
		return result;
	}

}
