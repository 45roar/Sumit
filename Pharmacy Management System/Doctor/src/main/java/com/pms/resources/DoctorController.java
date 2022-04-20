package com.pms.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.models.Doctor;
import com.pms.repository.DoctorRepository;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
		
	@Autowired
	private DoctorRepository doctorRepository;
	
	@RequestMapping("/show")
	public List<Doctor> show() {
		return doctorRepository.findAll();
	}
}
