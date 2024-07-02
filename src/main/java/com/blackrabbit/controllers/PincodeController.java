package com.blackrabbit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.blackrabbit.services.PincodeService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/hibernatehustle")
public class PincodeController {

	@Autowired
	private PincodeService aPincodeService;
	
	@GetMapping("/pincode/{pincodeId}")
	public String getPincode(@PathVariable Long pincodeId) {
		return aPincodeService.getPincode(pincodeId);
	}
}
