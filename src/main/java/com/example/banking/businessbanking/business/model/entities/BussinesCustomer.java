package com.example.banking.businessbanking.business.model.entities;

import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@PrimaryKeyJoinColumn(referencedColumnName = "bussines") //reemplaza id
@Table(name="bussines_customer")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BussinesCustomer extends Customer {
	
	@Column(name="account",nullable = false)
	private String account;
}
