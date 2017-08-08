package management.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import management.web.enitity.TrainingDog;

public interface TrainingDogRepository extends JpaRepository<TrainingDog, Long>, CustomRepository<TrainingDog> {

}
