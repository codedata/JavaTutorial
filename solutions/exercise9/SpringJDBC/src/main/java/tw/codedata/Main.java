package tw.codedata;

import org.hsqldb.jdbc.JDBCDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = dataSource();
        
        DvdDao dvdDao = new DvdDaoJdbcImpl(dataSource).createTables();

        dvdDao.saveDvd(new Dvd("test1", 1234, 1, "test"));
        for(Dvd dvd : dvdDao.allDvds()) {
            System.out.println(dvd.title);
            System.out.println(dvd.year);
            System.out.println(dvd.duration);
            System.out.println(dvd.director);
        }
    }


    public static DataSource dataSource() {
        JDBCDataSource dataSource = new JDBCDataSource();
        dataSource.setUrl("jdbc:hsqldb:file:src/main/resources/db/dvd_library");
        dataSource.setUser("codedata");
        dataSource.setPassword("123456");
        return dataSource;
    }

}