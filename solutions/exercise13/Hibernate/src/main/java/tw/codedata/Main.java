package tw.codedata;

import org.hibernate.*;

public class Main {
    public static void main(String[] args) {
        
        SessionFactory factory = HibernateUtil.getSessionFactory();
        
        DirectorDao directorDao = new DirectorDaoHibernateImpl(factory);
        DvdDao dvdDao = new DvdDaoHibernateImpl(factory);
        
        Director director = new Director("XD");
        directorDao.saveDirector(director);
       
        dvdDao.saveDvd(new Dvd("XD", 112, 1, director));
        
        for(Dvd dvd : dvdDao.allDvds()) {
           System.out.println(dvd);
        }
        
        HibernateUtil.closeAllResources();
        
    }
}