package models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by user on 22/03/2018.
 */
@Entity
@Table(name="carnivores")
public class Carnivore extends Dinosaur {

    public Carnivore(){};

    public Carnivore(String codeName, int height, int weight){
        super(codeName, height, weight);
    }
}
