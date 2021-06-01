package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    public Skill() {}

    public Skill(String description) {
        this.description = description;
    }

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank
    @Size(min = 1, max = 500, message = "Skill description must be 3-500 characters and not blank.")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}