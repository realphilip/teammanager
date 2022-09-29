package berlin.realphilip.teammanager.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Collaborator implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String discord;
    private String name;
    private String email;
    private String role;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String collaboratorPass;

    public Collaborator() {
    }

    public Collaborator(Long id, String discord, String name, String email, String role, String imageUrl, String collaboratorPass) {
        this.id = id;
        this.discord = discord;
        this.name = name;
        this.email = email;
        this.role = role;
        this.imageUrl = imageUrl;
        this.collaboratorPass = collaboratorPass;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiscord() {
        return discord;
    }

    public void setDiscord(String discord) {
        this.discord = discord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCollaboratorPass() {
        return collaboratorPass;
    }

    public void setCollaboratorPass(String collaboratorPass) {
        this.collaboratorPass = collaboratorPass;
    }

    @Override
    public String toString() {
        return "Collaborator{" +
                "id=" + id +
                ", discord='" + discord + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", collaboratorPass='" + collaboratorPass + '\'' +
                '}';
    }
}
