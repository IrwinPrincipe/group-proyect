package com.example.banking.businessbanking.business.model.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity()
@Table(name="customers")
@Inheritance(strategy = InheritanceType.JOINED)
@Data

public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "first_name", length = 30, nullable = false)
	private String fisrtName;

	@Column(name = "last_name", length = 30, nullable = false)
	private String lastName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_of_birth", nullable = false)
	private Date dateOfBirth;

	@Column(name = "dni", unique = true, nullable = false, length = 8)
	private String dni;

	@Column(name = "address", nullable = false, length = 50)
	private String address;

	@Column(name = "email", nullable = false, length = 30)
	private String email;

	@Column(name = "phone_number", nullable = false, length = 9)
	private String phoneNumber;
}
