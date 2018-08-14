import db.DBHelper;
import models.Director;

public class Runner {

    public static void main(String[] args) {
       Director director1 = new Director("Mark Modjelevsky");
        DBHelper.save(director1);

    }
}
