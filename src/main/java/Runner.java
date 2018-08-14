import db.DBDirector;
import db.DBHelper;
import models.Director;
import models.Film;
import models.Genre;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
       Director director1 = new Director("Mark Modjelevsky");
        DBHelper.save(director1);

        Film film1 = new Film(2, "Incredible", director1, "Restrected", Genre.ACTION);
        DBHelper.save(film1);

        Director foundDirector = DBHelper.find(Director.class, director1.getId());

        List<Film> directorFilms = DBDirector.getAllDirectorFilms(director1);
    }
}
