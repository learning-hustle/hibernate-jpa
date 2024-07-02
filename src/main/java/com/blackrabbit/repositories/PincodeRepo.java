package com.blackrabbit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blackrabbit.entities.PincodeDetails;

public interface PincodeRepo extends JpaRepository<PincodeDetails, Long>{

}
