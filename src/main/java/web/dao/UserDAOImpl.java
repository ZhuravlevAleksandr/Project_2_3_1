package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    protected EntityManager getEntityManager() {
        return this.entityManager;
    }

    @Override
    public List<User> index() {
        return getEntityManager().createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User show(int id) {
        return getEntityManager().find(User.class, id);
    }

    @Override
    public void save(User user) {
        getEntityManager().persist(user);
    }

    @Override
    public void update(int id, User user) {
        getEntityManager().merge(user);
    }

    @Override
    public void delete(int id) {
        getEntityManager()
                .createQuery("delete from User where id=: id")
                .setParameter("id", id)
                .executeUpdate();
    }
}
