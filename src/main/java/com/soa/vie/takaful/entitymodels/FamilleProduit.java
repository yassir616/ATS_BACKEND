package com.soa.vie.takaful.entitymodels;


import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FamilleProduit extends AbstractBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 @Column
	    private String name;
	 
	

	

}
