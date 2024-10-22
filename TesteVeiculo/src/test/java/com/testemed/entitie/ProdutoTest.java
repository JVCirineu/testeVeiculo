package com.testemed.entitie;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProdutoTest {

	private Produto produto;
	
	@BeforeEach
	void setUp() {
		//Arrange
		produto = new Produto(1L,"Motoca",20.000);
	}
	
	@Test
	@DisplayName("Testando getter e setter do ID")
	void testId() {
		produto.setId(2L);
		//Assert
		assertEquals(2L,produto.getId());
	}
	
	@Test
	@DisplayName("Testando getter e setter do NOME")
	void testNome() {
		//Act
		produto.setNome("Civicoide");
		//Assert
		assertEquals("Civicoide", produto.getNome());
	}
	@Test
	@DisplayName("Testando getter e setter do PRECO")
	void testPreco() {
		//Act
		produto.setPreco(50.000);
		//Assert
		assertEquals(50.000, produto.getPreco());
	}
	
	@Test
	@DisplayName("Testando todos os argumentos")
	void testConstrutor() {
		//Act
		Produto novoProduto = new Produto(3L,"Jeep",100.000);
		//Assert
		assertAll("novoProduto",
				()-> assertEquals(3L,novoProduto.getId()),
				()-> assertEquals("Jeep",novoProduto.getNome()),
				()-> assertEquals(100.000,novoProduto.getPreco()));
			
	}
}
