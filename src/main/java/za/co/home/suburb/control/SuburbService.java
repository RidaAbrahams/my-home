package za.co.home.suburb.control;

import za.co.home.suburb.boundary.SuburbDTO;
import za.co.home.suburb.entity.Suburb;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import java.util.Objects;

import static za.co.home.suburb.entity.Suburb.FIND_BY_ID;

@ApplicationScoped
public class SuburbService {

    @Inject
    EntityManager em;

    @Transactional
    public void addSuburb(SuburbDTO suburbDTO) {
        Suburb suburb = Suburb.fromSuburbDTO(suburbDTO);
        em.persist(suburb);
        System.out.println("Suburbs Added...");
    }

    public SuburbDTO getSuburb(Long id) {
        Query query = em.createNamedQuery(FIND_BY_ID);
        query.setParameter("id", id);
        Object singleResult = null;
        try {
            singleResult = query.getSingleResult();
        } catch (javax.persistence.NoResultException e) {
            return null;
        }
        Suburb suburbEntity = (Suburb) singleResult;
        return SuburbDTO.fromSuburbEntity(suburbEntity);
    }
}
