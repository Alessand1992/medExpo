package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.Logo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogoRepo extends JpaRepository<Logo,Long> {
}
