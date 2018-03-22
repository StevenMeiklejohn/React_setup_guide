package models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 22/03/2018.
 */
@Entity
@Table(name="park")
public class Park {
    private int id;
    private String name;
    private List<Enclosure> enclosures;
    private List<Dinosaur> nursery;
    private List<Visitor> visitors;
    private String lockDownStatus;
    private List<Edible> foodStore;

    public Park(){};

    public Park(String name, List<Enclosure> enclosures, List<Dinosaur> nursery){
        this.name = name;
        this.enclosures = enclosures;
        this.nursery = nursery;
    }

    @Id
    @GeneratedValue
    @Column(name="id")
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

//    @OneToMany(mappedBy="park",fetch= FetchType.EAGER)
    @Column(name="enclosures")
    public List<Enclosure> getEnclosures() {
        return enclosures;
    }

    public void setEnclosures(List<Enclosure> enclosures) {
        this.enclosures = enclosures;
    }

    @Column(name="nursery")
    public List<Dinosaur> getNursery() {
        return nursery;
    }

    public void setNursery(List<Dinosaur> nursery) {
        this.nursery = nursery;
    }

//    @OneToMany(mappedBy="park", fetch = FetchType.EAGER)
    @Column(name="visitors")
    public List<Visitor> getVisitors() {
        return visitors;
    }

    public void setVisitors(List<Visitor> visitors) {
        this.visitors = visitors;
    }

    @Column(name="lockDownStatus")
    public String getLockDownStatus() {
        return lockDownStatus;
    }

    public void setLockDownStatus(String lockDownStatus) {
        this.lockDownStatus = lockDownStatus;
    }

    @Column(name="foodStore")
    public List<Edible> getFoodStore() {
        return foodStore;
    }

    public void setFoodStore(List<Edible> foodStore) {
        this.foodStore = foodStore;
    }
}
