package repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apicampeones.modelos.campeones;

public interface CampeonesRepo extends JpaRepository<campeones,Long> {

	void deleteCampeonesById(Long id);

	//Optional es un generico, debo especificarle el objeto
	Optional <campeones> findCampeonesById(Long id);

}
