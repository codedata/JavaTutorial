package tw.codedata;

public class Dvd {
    private String title;
    private Integer year;
    private Integer duration;
    private String director;

    public Dvd(String title, Integer year, Integer duration, String director) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getDirector() {
        return director;
    }
    
    
}
