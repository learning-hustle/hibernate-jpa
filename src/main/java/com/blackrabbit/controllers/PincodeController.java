package com.blackrabbit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.blackrabbit.entities.PincodeDetail;
import com.blackrabbit.services.PincodeService;

//import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/hibernatehustle")
public class PincodeController {

	@Autowired
	private PincodeService aPincodeService;

	@GetMapping("/pincode/{pincodeId}")
	public PincodeDetail getPincode(@PathVariable Long pincodeId) {
		return aPincodeService.getPincode(pincodeId);
	}

	@PostMapping("/pincode")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String doSavePincode(@RequestBody PincodeDetail aPincodeDetail) {
		return aPincodeService.savePincode(aPincodeDetail) ? "Record Saved Successfully" : "Save Operation Failed";
	}
}
