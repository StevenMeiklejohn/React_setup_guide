package models;

import javax.persistence.*;

/**
 * Created by user on 22/03/2018.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Edible {

    private int id;
    private String description;
    private int nutrition;

    public Edible(){};

    public Edible(String description, int nutrition){
        this.description = description;
        this.nutrition = nutrition;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="nutrition")
    public int getNutrition() {
        return nutrition;
    }

    public void setNutrition(int nutrition) {
        this.nutrition = nutrition;
    }
}
