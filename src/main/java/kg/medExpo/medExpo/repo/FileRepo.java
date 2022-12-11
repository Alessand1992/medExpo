package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends JpaRepository<File,Long> {
}
