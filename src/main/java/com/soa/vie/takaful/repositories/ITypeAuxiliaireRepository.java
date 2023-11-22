package com.soa.vie.takaful.repositories;

import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.soa.vie.takaful.entitymodels.TypeAuxiliaire;
@Repository
@JaversSpringDataAuditable
public interface ITypeAuxiliaireRepository extends PagingAndSortingRepository<TypeAuxiliaire, String>{
	
	public Optional<TypeAuxiliaire> findByCode(String code);
	public Optional<TypeAuxiliaire>  findByLibelle(String libelle);


}
