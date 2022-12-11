package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.ManagerPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerPhoneRepo extends JpaRepository<ManagerPhone,Long> {
}
