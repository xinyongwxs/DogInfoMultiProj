package management.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import management.web.enitity.WorkingDog;

public interface WorkingDogRepository extends JpaRepository<WorkingDog, Long>, CustomRepository<WorkingDog> {

}
