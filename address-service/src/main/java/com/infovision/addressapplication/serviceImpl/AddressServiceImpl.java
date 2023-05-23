package com.infovision.addressapplication.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infovision.addressapplication.dto.AddressDto;
import com.infovision.addressapplication.entities.Address;
import com.infovision.addressapplication.repositories.AddressRepository;
import com.infovision.addressapplication.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService {
@Autowired
AddressRepository addressRepository;
@Autowired
ModelMapper mapper;
	@Override
	public ResponseEntity<AddressDto> getAddressByempId(Long empid) {
		Address address = addressRepository.findAddressByEmpId(empid);
		AddressDto addressDto = mapper.map(address, AddressDto.class);
		
		
		return new ResponseEntity<AddressDto>(addressDto,HttpStatus.OK);
	}
	@Override
	public ResponseEntity<Address> saveAddress(Address address) {
		
		Address save = addressRepository.save(address);
	
		return new ResponseEntity<Address>(save,HttpStatus.CREATED);
	}
	@Override
	public ResponseEntity<List<Address>> getAllEmployee() {
		List<Address> getEmployeeList = addressRepository.findAll();
		return new ResponseEntity<List<Address>> (getEmployeeList,HttpStatus.OK);
	}

}
