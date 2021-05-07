package com.devwill.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devwill.dsvendas.entities.Seller;

public interface SellerRepository  extends JpaRepository<Seller, Long>{

}
