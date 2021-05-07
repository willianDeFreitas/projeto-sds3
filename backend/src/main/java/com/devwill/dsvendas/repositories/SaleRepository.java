package com.devwill.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devwill.dsvendas.entities.Sale;

public interface SaleRepository  extends JpaRepository<Sale, Long>{

}
