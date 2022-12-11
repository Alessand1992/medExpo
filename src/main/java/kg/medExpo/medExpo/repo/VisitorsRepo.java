package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorsRepo extends JpaRepository<Visitor,Long> {
}
