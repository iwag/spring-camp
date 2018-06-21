package hello.repository;

import hello.model.KusaRecord;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class KusaRecordRepositoryImpl implements KusaRecordResository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public KusaRecord findById(int id) {
        return this.em.find(KusaRecord.class, id);
    }

    @Override
    public void save(KusaRecord pet) {
        if (pet.getId() == null) {
            this.em.persist(pet);
        } else {
            this.em.merge(pet);
        }
    }
}
