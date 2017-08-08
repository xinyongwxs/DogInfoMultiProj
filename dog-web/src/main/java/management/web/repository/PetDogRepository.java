package management.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import management.web.enitity.PetDog;

public interface PetDogRepository extends JpaRepository<PetDog, Long>, CustomRepository<PetDog> {

}
