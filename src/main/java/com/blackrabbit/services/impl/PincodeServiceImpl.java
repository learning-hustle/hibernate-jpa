package com.blackrabbit.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackrabbit.entities.PincodeDetails;
import com.blackrabbit.repositories.PincodeRepo;
import com.blackrabbit.services.PincodeService;

@Service
public class PincodeServiceImpl implements PincodeService{
	
	@Autowired
	PincodeRepo aPincodeRepo;
	
	@Override
	public String getPincode(Long pincodeId) {
		Optional<PincodeDetails> aOptional = aPincodeRepo.findById(pincodeId);
		PincodeDetails aPincodeDetails = aOptional.get();
		return aPincodeDetails.getPincode();
	}

}
