package kg.medExpo.medExpo.repo;

import kg.medExpo.medExpo.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepo extends JpaRepository<Video,Long> {
}
