package management.web.repository;

import java.util.List;
import java.util.Map;

import management.web.enitity.BreedingDog;

public interface CustomRepository<T> {
	List<T> getLimitItems(Integer limit, Integer offset, Map<String, Object> filter, String orderByName, String sortMethod);
}
