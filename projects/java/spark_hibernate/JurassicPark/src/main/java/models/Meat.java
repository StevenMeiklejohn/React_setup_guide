package models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by user on 22/03/2018.
 */
@Entity
@Table(name="meats")
public class Meat extends Edible{

    public Meat(){};

    public Meat(String description, int nutrition){
        super(description, nutrition);
    }
}
