package models;

import javax.persistence.*;


@Entity
@Table(name = "Films")
public class Film {

    private int id;
    private String title;
    private Director director;
    private String ageRating;
    private Genre genre;

    public Film(){ }

    public Film(int id, String title, Director director, String ageRating, Genre genre) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.ageRating = ageRating;
        this.genre = genre;
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

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn (name = "director_id", nullable = false)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Enumerated(value = EnumType.STRING)
    public Genre getGenre(){
        return genre;
    }

    public void setGenre(Genre genre){
        this.genre = genre;
    }

    @Column(name = "age_rating")
    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }
}


