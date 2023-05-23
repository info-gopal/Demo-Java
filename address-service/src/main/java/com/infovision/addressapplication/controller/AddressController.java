package com.infovision.addressapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infovision.addressapplication.dto.AddressDto;
import com.infovision.addressapplication.entities.Address;
import com.infovision.addressapplication.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	AddressService addressService;
	
	@GetMapping("/{empid}")
	ResponseEntity<AddressDto> getAddressByEmployeId(@PathVariable("empid") Long empid){
		
		ResponseEntity<AddressDto> addressByempId = addressService.getAddressByempId(empid);
		
		return addressByempId;
	}
@PostMapping
ResponseEntity<Address> saveEmployeeAdreess(@RequestBody Address address){
	
	ResponseEntity<Address> saveAddress = addressService.saveAddress(address);

	return saveAddress;
}

@GetMapping
ResponseEntity<List<Address>> getAllEmployee(){
	
	
	return addressService.getAllEmployee();
}
	
}
