package tw.codedata;

import com.google.common.base.Optional;
import java.util.List;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorDaoHibernateImpl implements DirectorDao {
    private SessionFactory sessionFactory;

    @Autowired
    public DirectorDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void saveDirector(Director director) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(director);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Optional<Director> maybeFromName(String name) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        List<Director> directors = 
                          session
                          .createQuery("from Director as d where d.name = :name")
                          .setString("name", name).list();
        
        session.getTransaction().commit();
        session.close();
        
        return directors.isEmpty() ? Optional.<Director>absent() :  Optional.of(directors.get(0));
        
    }
    
}
