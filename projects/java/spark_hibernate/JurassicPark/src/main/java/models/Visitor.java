package models;

import javax.persistence.*;

/**
 * Created by user on 22/03/2018.
 */
@Entity
@Table(name="visitors")
public class Visitor {
    private int id;
    private String name;
    private int health;
    private int runSpeed;

    public Visitor(){};

    public Visitor(String name, int runSpeed){
        this.name = name;
        this.runSpeed = runSpeed;
        this.health = 100;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="health")
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Column(name="runSpeed")
    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }
}
