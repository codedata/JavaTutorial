package tw.codedata;

import javax.persistence.*;

@Entity
@Table(name="dvds")
public class Dvd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Integer year;
    private Integer duration;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="director_id")
    private Director director;
    
    public Dvd() {}

    public Dvd(String title, Integer year, Integer duration, Director director) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.director = director;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Dvd{" + 
                "id=" + id + 
                ", title=" + title + 
                ", year=" + year + 
                ", duration=" + duration + 
                ", director=" + director + 
        '}';
    }

    
    
}
