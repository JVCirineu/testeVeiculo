package com.testemed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testemed.entitie.Produto;

public interface ProdutoRepository extends JpaRepository<Long, Produto>{

}
