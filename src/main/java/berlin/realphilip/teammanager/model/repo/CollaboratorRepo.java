package berlin.realphilip.teammanager.model.repo;

import berlin.realphilip.teammanager.model.Collaborator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CollaboratorRepo extends JpaRepository<Collaborator, Long> {
    void deleteCollaboratorById(Long id);

    Optional<Collaborator> findCollaboratorById(Long id);
}
