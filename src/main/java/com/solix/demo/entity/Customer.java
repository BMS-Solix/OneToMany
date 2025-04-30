package com.solix.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "customers")
@NoArgsConstructor
@Data
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID")
	private Integer id;
	
	@Column(name ="EMAIL_ADDRESS")
	private String emailAddress;
	 
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "customer")
	List<ProductReview> review = new ArrayList<>();


}
