package com.blackrabbit.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackrabbit.entities.PincodeDetail;
import com.blackrabbit.repositories.PincodeDetailRepo;
import com.blackrabbit.services.PincodeService;

@Service
public class PincodeServiceImpl implements PincodeService{
	
	@Autowired
	PincodeDetailRepo aPincodeRepo;
	
	@Override
	public PincodeDetail getPincode(Long pincodeId) {
		Optional<PincodeDetail> aOptional = aPincodeRepo.findById(pincodeId);
		PincodeDetail aPincodeDetails = aOptional.get();
		return aPincodeDetails;
	}

	@Override
	public boolean savePincode(PincodeDetail aPincodeDetail) {

		PincodeDetail thePincodeDetail = aPincodeRepo.save(aPincodeDetail);
		return thePincodeDetail != null ? true : false;
		
	}
	

}
