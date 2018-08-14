package models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "directors")
public class Director {

    private int id;
    private String name;
    private List<Film> films;

    public Director() { }


    public Director(int id, String name, List<Film> films) {
        this.id = id;
        this.name = name;
        this.films = films;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany( mappedBy = "director", fetch = FetchType.LAZY)
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
