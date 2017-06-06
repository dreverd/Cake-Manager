package com.waracle.cakemgr.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
 
import com.waracle.cakemgr.model.CakeEntity;

@Repository("cakeDao")
public class CakeDaoImpl extends AbstractDao implements CakeDao{
 
    public void saveCake(CakeEntity cake) {
        persist(cake);
    }
 
    @SuppressWarnings("unchecked")
    public List<CakeEntity> findAllCakes() {
        Criteria criteria = getSession().createCriteria(CakeEntity.class);
        return (List<CakeEntity>) criteria.list();
    }
 
    public void deleteCakeBySsn(String ssn) {
        Query query = getSession().createSQLQuery("delete from Cake where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }
 
     
    public CakeEntity findBySsn(String ssn){
        Criteria criteria = getSession().createCriteria(CakeEntity.class);
        criteria.add(Restrictions.eq("ssn",ssn));
        return (CakeEntity) criteria.uniqueResult();
    }
     
    public void updateCake(CakeEntity cake){
        getSession().update(cake);
    }
     
}