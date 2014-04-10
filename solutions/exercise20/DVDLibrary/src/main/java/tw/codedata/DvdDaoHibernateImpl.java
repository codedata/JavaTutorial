package tw.codedata;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DvdDaoHibernateImpl implements DvdDao {
    private SessionFactory sessionFactory;

    @Autowired
    public DvdDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveDvd(Dvd dvd) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(dvd);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Dvd> allDvds() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
         List<Dvd> dvds = session.createQuery("from Dvd").list();
        
        session.getTransaction().commit();
        session.close();
        
        return dvds;
    }

}
