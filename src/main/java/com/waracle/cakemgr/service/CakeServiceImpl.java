package com.waracle.cakemgr.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.waracle.cakemgr.dao.CakeDao;
import com.waracle.cakemgr.model.CakeEntity;

@Service("cakeService")
@Transactional
public class CakeServiceImpl implements CakeService{

   @Autowired
   private CakeDao dao;
    
   public void saveCake(CakeEntity cake) {
       dao.saveCake(cake);
   }

   public List<CakeEntity> findAllCakes() {
       return dao.findAllCakes();
   }

   public void deleteCakeBySsn(String ssn) {
       dao.deleteCakeBySsn(ssn);
   }

   public CakeEntity findBySsn(String ssn) {
       return dao.findBySsn(ssn);
   }

   public void updateCake(CakeEntity cake){
       dao.updateCake(cake);
   }
}
