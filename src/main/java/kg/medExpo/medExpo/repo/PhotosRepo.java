package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.Photos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotosRepo extends JpaRepository<Photos,Long> {
}
