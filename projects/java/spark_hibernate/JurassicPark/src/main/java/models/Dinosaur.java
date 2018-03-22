package models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 22/03/2018.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Dinosaur {

    private int id;
    private String codeName;
    private int height;
    private int weight;
    private List<Edible> stomach;

    public Dinosaur(){};

    public Dinosaur(String codeName, int height, int weight){
        this.codeName = codeName;
        this.height = height;
        this.weight = weight;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="codeName")
    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    @Column(name="height")
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Column(name="weight")
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Column(name="stomach")
    public List<Edible> getStomach() {
        return stomach;
    }

    public void setStomach(List<Edible> stomach) {
        this.stomach = stomach;
    }
}
