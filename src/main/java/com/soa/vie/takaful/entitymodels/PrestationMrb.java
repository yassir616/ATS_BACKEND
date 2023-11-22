package com.soa.vie.takaful.entitymodels;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.soa.vie.takaful.util.PrestationStatusEnum;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class PrestationMrb extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;
	
	    @Column
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	    private Date datePrestation ;

	    @Column
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	    private Date dateReglement ;

	    @Column(nullable = false)
	    private Boolean isTraiter = false;

	    @Column
	    private String modeReglement;

	    @Column
	    private float montant;

	    @Column(nullable = false, columnDefinition = "varchar(255)")
	    private String numeroSinistre;

	    @Column
	    private float montantNet;

	    @Column
	    private String typePrestation;

	    @ManyToOne
	    private ContratMrb contratMrb;

	    @Column(nullable = false)
	    @Enumerated(EnumType.STRING)
	    private PrestationStatusEnum status = PrestationStatusEnum.EN_COURS;


}
