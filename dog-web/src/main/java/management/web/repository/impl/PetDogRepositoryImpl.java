package management.web.repository.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import management.web.enitity.BreedingDog;
import management.web.enitity.PetDog;
import management.web.repository.CustomRepository;
import management.web.repository.common.DogCommonDao;

public class PetDogRepositoryImpl implements CustomRepository<PetDog> {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<PetDog> getLimitItems(Integer limit, Integer offset, Map<String, Object> filter,
			String orderByName, String sortMethod) {
		DogCommonDao<PetDog> dd = new DogCommonDao<PetDog>(){};
		List<PetDog> result = dd.getLimitItems(limit, offset, filter, orderByName, sortMethod, em);
		return result;
	}

}
