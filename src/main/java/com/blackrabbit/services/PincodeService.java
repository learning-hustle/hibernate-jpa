package com.blackrabbit.services;

import com.blackrabbit.entities.PincodeDetail;

public interface PincodeService {

	public PincodeDetail getPincode(Long pincodeId);
	
	public boolean savePincode(PincodeDetail aPincodeDetail);
	
}
