package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@NamedQueries({
@NamedQuery(name="selectAll", query="from CartoonDTO car"),
@NamedQuery(name="update", query="update CartoonDTO car set car.cartoonName=: cn where car.cartoonId=: ci"),
@NamedQuery(name="delete", query="delete  CartoonDTO car where car.cartoonId= \"+cartoonId1+\" ")})

@Entity
@Table(name="cartoon_table")
@Getter
@Setter
@ToString
public class CartoonDTO {
	
	@Id
	@Column(name="cartoon_id")
	private Integer cartoonId;
	@Column(name="cartoon_name")
	private String cartoonName;
	
	
	


	
}
