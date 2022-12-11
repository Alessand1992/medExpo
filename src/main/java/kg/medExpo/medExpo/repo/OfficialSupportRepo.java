package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.OfficialSupport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficialSupportRepo extends JpaRepository<OfficialSupport,Long> {
}
