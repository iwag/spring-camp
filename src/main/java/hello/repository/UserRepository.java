package hello.repository;

import hello.model.KusaRecord;
import hello.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
}
