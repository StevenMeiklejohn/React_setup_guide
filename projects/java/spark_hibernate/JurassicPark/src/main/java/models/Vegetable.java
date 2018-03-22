package models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by user on 22/03/2018.
 */
@Entity
@Table(name="vegetables")
public class Vegetable extends Edible{

    public Vegetable(){};

    public Vegetable(String description, int nutrition){
        super(description, nutrition);
    }
}
