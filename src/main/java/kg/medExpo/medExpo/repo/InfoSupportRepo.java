package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.InfoSupport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoSupportRepo extends JpaRepository<InfoSupport,Long> {
}
