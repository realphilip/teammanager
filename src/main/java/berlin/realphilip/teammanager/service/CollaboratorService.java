package berlin.realphilip.teammanager.service;

import berlin.realphilip.teammanager.exception.UserNotFoundException;
import berlin.realphilip.teammanager.model.Collaborator;
import berlin.realphilip.teammanager.model.repo.CollaboratorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CollaboratorService {
    private final CollaboratorRepo collaboratorRepo;

    @Autowired
    public CollaboratorService(CollaboratorRepo collaboratorRepo) {
        this.collaboratorRepo = collaboratorRepo;
    }

    public Collaborator addCollaborator(Collaborator collaborator){
        collaborator.setCollaboratorPass(UUID.randomUUID().toString());
        return collaboratorRepo.save(collaborator);
    }

    public List<Collaborator> findAllCollaborators(){
        return collaboratorRepo.findAll();
    }

    public Collaborator updateCollaborator (Collaborator collaborator){
        return collaboratorRepo.save(collaborator);
    }

    public void deleteCollaborator(Long id){
         collaboratorRepo.deleteCollaboratorById(id);
    }

    public Collaborator findCollaboratorById(Long id){
        return collaboratorRepo.findCollaboratorById(id).orElseThrow(() -> new UserNotFoundException("Collaborator by id " + id + " was not found"));
    }
}
