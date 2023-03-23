package com.krishnan.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishnan.Springboot.model.Bankdata;

public interface BankdataRepository extends JpaRepository<Bankdata,Long>{

}
