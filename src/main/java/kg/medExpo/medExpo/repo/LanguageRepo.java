package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepo extends JpaRepository<Language,Long> {
}
