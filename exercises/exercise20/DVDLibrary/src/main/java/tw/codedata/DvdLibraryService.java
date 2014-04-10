package tw.codedata;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dvdLibraryService")
public class DvdLibraryService {
    private DirectorDao directorDao;
    private DvdDao dvdDao;

    @Autowired
    public void setDirectorDao(DirectorDao directorDao) {
        this.directorDao = directorDao;
    }

    @Autowired
    public void setDvdDao(DvdDao dvdDao) {
        this.dvdDao = dvdDao;
    }

    public DirectorDao getDirectorDao() {
        return directorDao;
    }

    public DvdDao getDvdDao() {
        return dvdDao;
    }
    
    public List<Dvd> allDvds() {

        return getDvdDao().allDvds();
    }
    
    public Dvd addDvd(String title, Integer year, Integer duration, String directorName) {
        Director director = new Director(directorName);
        getDirectorDao().saveDirector(director);
        Dvd dvd = new Dvd(title, year, duration, director);
        getDvdDao().saveDvd(dvd);
        return dvd;
    }
}
