package hello.repository;

import hello.model.KusaRecord;
import hello.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepository {
    @PersistenceContext
    private EntityManager em;

    public User findById(int id) {
        return this.em.find(User.class, id);
    }

    public void save(User pet) {
        if (pet.getId() == null) {
            this.em.persist(pet);
        } else {
            this.em.merge(pet);
        }
    }

    public User getActiveUser(String userName) {
        User activeUserInfo = new User();
        short enabled = 1;
        List<?> list = em.createQuery("SELECT u FROM UserInfo u WHERE userName=? and enabled=?")
                .setParameter(1, userName).setParameter(2, enabled).getResultList();
        if(!list.isEmpty()) {
            activeUserInfo = (User)list.get(0);
        }
        return activeUserInfo;
    }
}
