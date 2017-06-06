package com.waracle.cakemgr.dao;

import java.util.List;

import com.waracle.cakemgr.model.CakeEntity;
 
public interface CakeDao {
 
    void saveCake(CakeEntity cake);
     
    List<CakeEntity> findAllCakes();
     
    void deleteCakeBySsn(String ssn);
     
    CakeEntity findBySsn(String ssn);
     
    void updateCake(CakeEntity cake);
}