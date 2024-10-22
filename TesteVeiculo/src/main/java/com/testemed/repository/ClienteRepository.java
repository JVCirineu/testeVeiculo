package com.testemed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testemed.entitie.Cliente;

public interface ClienteRepository extends JpaRepository <Long, Cliente> {


}
