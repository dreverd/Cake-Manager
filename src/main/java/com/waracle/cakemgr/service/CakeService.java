package com.waracle.cakemgr.service;

import java.util.List;

import com.waracle.cakemgr.model.CakeEntity;
 
public interface CakeService {
 
    void saveCake(CakeEntity cake);
 
    List<CakeEntity> findAllCakes();
 
    void deleteCakeBySsn(String ssn);
 
    CakeEntity findBySsn(String ssn);
 
    void updateCake(CakeEntity cake);
}