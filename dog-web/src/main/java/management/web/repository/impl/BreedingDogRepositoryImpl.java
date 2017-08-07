package management.web.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import management.web.enitity.BreedingDog;
import management.web.repository.CustomRepository;
import management.web.repository.common.DogCommonDao;

public class BreedingDogRepositoryImpl implements CustomRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<BreedingDog> getLimitItems(Integer limit, Integer offset, Map<String, Object> filter,
			String orderByName, String sortMethod) {
		DogCommonDao<BreedingDog> dd = new DogCommonDao<BreedingDog>(){};
		List<BreedingDog> result = dd.getLimitItems(limit, offset, filter, orderByName, sortMethod, em);
		return result;
	}
}
