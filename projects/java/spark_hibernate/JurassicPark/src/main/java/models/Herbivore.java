package models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by user on 22/03/2018.
 */
@Entity
@Table(name="herbivores")
public class Herbivore extends Dinosaur {

    public Herbivore(){};

    public Herbivore(String codeName, int height, int weight){
        super(codeName, height, weight);
    }
}
