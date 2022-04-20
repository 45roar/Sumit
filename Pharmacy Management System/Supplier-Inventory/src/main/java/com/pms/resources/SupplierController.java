package com.pms.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.models.Supplier;
import com.pms.repository.SupplierRepository;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
	
	@Autowired
	SupplierRepository supplierRepository;
	
	@RequestMapping("/show")
	  public List<Supplier> view(){
	    	 return supplierRepository.findAll();
	     }
}
