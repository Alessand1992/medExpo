package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.Role;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {
}
