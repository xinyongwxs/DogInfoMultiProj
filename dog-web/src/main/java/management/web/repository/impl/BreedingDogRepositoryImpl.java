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

public class BreedingDogRepositoryImpl implements CustomRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<BreedingDog> getLimitItems(Integer limit, Integer offset, Map<String, Object> filter,
			String orderByName, String sortMethod) {
		List<BreedingDog> result = null;
		String queryStr = "select s from BreedingDog s";
		if (!filter.equals(null)) {
			queryStr = queryStr + " where ";
			int currentIndex = 0;
			List<Object> args = new ArrayList<Object>();
			for (Entry<String, Object> entry: filter.entrySet()) {
				args.add(entry.getKey());
				args.add(entry.getKey());
				if (currentIndex < filter.size() - 1) {
					queryStr = queryStr + "%s=:%s and ";
					currentIndex++;
				} else {
					queryStr = queryStr + "%s=:%s";
				}
			}
			queryStr = String.format(queryStr, args.toArray());
		}
		
		if (!orderByName.equals(null) && !sortMethod.equals(null)) {
			queryStr = String.format(queryStr + " order by %s %s", orderByName, sortMethod);
		}
		
		TypedQuery<BreedingDog> rq = em.createQuery(queryStr, BreedingDog.class);
		for (Entry<String, Object> entry: filter.entrySet()) {
			rq.setParameter(entry.getKey(), entry.getValue());
		}
		
		if (!limit.equals(null)) {
			rq = rq.setMaxResults(limit);
		}
		
		if (!offset.equals(null)) {
			rq = rq.setFirstResult(offset);
		}
		
		result = rq.getResultList();
		
		return result;
	}

}
