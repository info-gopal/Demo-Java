package com.infovision.addressapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.infovision.addressapplication.dto.AddressDto;
import com.infovision.addressapplication.entities.Address;

public interface AddressService {

	ResponseEntity<AddressDto> getAddressByempId(Long empid);

	ResponseEntity<Address> saveAddress(Address address);
	ResponseEntity<List<Address>> getAllEmployee();

}
