package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepo extends JpaRepository<Sponsor,Long> {
}
