package com.pms.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.models.Drug;
import com.pms.repository.DrugRepository;

@RestController
@RequestMapping("/drug")
public class DrugController {

	@Autowired
	private DrugRepository drugRepository;
	
	@RequestMapping("/show")
	public List<Drug> show(){
		return drugRepository.findAll();
	}
}
