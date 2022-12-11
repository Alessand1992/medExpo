package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.PressRelease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PressReleaseRepo extends JpaRepository<PressRelease,Long> {
}
