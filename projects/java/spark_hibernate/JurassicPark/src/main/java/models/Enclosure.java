package models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 22/03/2018.
 */

@Entity
@Table(name="enclosures")
public class Enclosure {

    private int id;
    private String type;
    private List<Dinosaur> dinosaurs;
    private int capacity;
    private String lockDownStatus;

    public Enclosure(){};

    public Enclosure(String type, int capacity){
        this.type = type;
        this.capacity = capacity;
        this.lockDownStatus = "locked";
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name="dinosaurs")
    public List<Dinosaur> getDinosaurs() {
        return dinosaurs;
    }

    public void setDinosaurs(List<Dinosaur> dinosaurs) {
        this.dinosaurs = dinosaurs;
    }

    public void addDinosaur(Dinosaur dino){
        dinosaurs.add(dino);
    }

    public void removeDinosaur(Dinosaur dino){
        dinosaurs.remove(dino);
    }

    @Column(name="capacity")
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Column(name="lockDownStatus")
    public String getLockDownStatus() {
        return lockDownStatus;
    }

    public void setLockDownStatus(String lockDownStatus) {
        this.lockDownStatus = lockDownStatus;
    }
}
