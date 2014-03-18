package tw.codedata;

import com.google.common.base.Optional;

public interface DirectorDao {
    void saveDirector(Director director);
    Optional<Director> maybeFromName(String name);
}
