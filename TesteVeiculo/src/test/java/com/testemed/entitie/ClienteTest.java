package com.testemed.entitie;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClienteTest {

private Cliente cliente;
	
	@BeforeEach
	void setUp() {
		//Arrange
		cliente = new Cliente(1L,"Julia","(15)99888-5566", "46307199890", "521750722");
	}
	
	@Test
	@DisplayName("Testando getter e setter do ID")
	void testId() {
		cliente.setId(2L);
		//Assert
		assertEquals(2L,cliente.getId());
	}
	
	@Test
	@DisplayName("Testando getter e setter do NOME")
	void testNome() {
		//Act
		cliente.setNome("Julia Vitoria");
		//Assert
		assertEquals("Julia Vitoria", cliente.getNome());
	}
	@Test
	@DisplayName("Testando getter e setter do CPF")
	void testEmail() {
		//Act
		cliente.setCpf("46307199890");
		//Assert
		assertEquals("46307199890", cliente.getCpf());
	}
	@Test
	@DisplayName("Testando getter e setter do TELEFONE")
	void testTelefone() {
		//Act
		cliente.setTelefone("(15)99888-5566");
		//Assert
		assertEquals("(15)99888-5566", cliente.getTelefone());
	}
	
	@Test
	@DisplayName("Testando todos os argumentos")
	void testConstrutor() {
		//Act
		Cliente novoCliente = new Cliente(3L,"Mateus", "(15)1111-1111", "55588899966", "178254652");
		//Assert
		assertAll("novoCliente",
				()-> assertEquals(3L,novoCliente.getId()),
				()-> assertEquals("Mateus",novoCliente.getNome()),
				()-> assertEquals("(15)1111-1111",novoCliente.getTelefone()),
				()-> assertEquals("55588899966",novoCliente.getCpf()),
				()-> assertEquals("178254652",novoCliente.getRg()));
	}
}
