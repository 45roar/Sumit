package com.pms.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Order-Info")
public class Order {
		
	private int id;
	
}
