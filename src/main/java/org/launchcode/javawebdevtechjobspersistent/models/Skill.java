package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    private String skillDescription;

    public Skill(){}

    public String getSkillDescription() { return skillDescription; }

    public void setSkillDescription(String skillDescription) { this.skillDescription = skillDescription; }
}