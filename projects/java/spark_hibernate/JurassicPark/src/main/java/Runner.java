import db.DBHelper;
import models.Visitor;

/**
 * Created by user on 22/03/2018.
 */
public class Runner {

    public static void main(String[] args) {

        Visitor visitor1 = new Visitor("Deirdre Barlow", 2);
        DBHelper.saveOrUpdate(visitor1);
    }
}
