package hello.repository;

import hello.model.KusaRecord;

public interface KusaRecordResository {
    public KusaRecord findById(int id) ;
    public void save(KusaRecord pet);
}
