package berlin.realphilip.teammanager;

import berlin.realphilip.teammanager.model.Collaborator;
import berlin.realphilip.teammanager.service.CollaboratorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collaborator")
public class CollaboratorResource {
    private final CollaboratorService collaboratorService;

    public CollaboratorResource(CollaboratorService collaboratorService) {
        this.collaboratorService = collaboratorService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Collaborator>> getAllCollaborators() {
        List<Collaborator> collaborators = collaboratorService.findAllCollaborators();
        return new ResponseEntity<>(collaborators, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Collaborator> getCollaboratorById(@PathVariable("id") Long id) {
        Collaborator collaborator = collaboratorService.findCollaboratorById(id);
        return new ResponseEntity<>(collaborator, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Collaborator> addCollaborator(@RequestBody Collaborator collaborator){
        Collaborator collaboratorToBeAdded = collaboratorService.addCollaborator(collaborator);
        return new ResponseEntity<>(collaboratorToBeAdded, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Collaborator> updateCollaborator(@RequestBody Collaborator collaborator){
        Collaborator updatedCollaborator = collaboratorService.updateCollaborator(collaborator);
        return new ResponseEntity<>(updatedCollaborator, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Collaborator> deleteCollaborator(@PathVariable("id") Long id){
        collaboratorService.deleteCollaborator(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
