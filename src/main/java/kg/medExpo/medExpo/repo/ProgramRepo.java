package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepo extends JpaRepository<Program,Long> {
}
