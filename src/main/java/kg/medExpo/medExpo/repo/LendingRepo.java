package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.Lending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LendingRepo extends JpaRepository<Lending,Long> {

    Lending findByIdAndLanguage(Long id,Long languageId);
}
