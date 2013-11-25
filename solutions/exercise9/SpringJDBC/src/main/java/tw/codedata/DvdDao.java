package tw.codedata;

import java.util.List;

public interface DvdDao {
    void saveDvd(Dvd dvd);
    List<Dvd> allDvds();
}
