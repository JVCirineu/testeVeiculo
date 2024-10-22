package com.testemed.entitie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VeiculoTest {

private Veiculo veiculo;
	
	@BeforeEach
	void setUp() {
		//Arrange
		veiculo = new Veiculo(1L,"Lamborghini","Urus", 2020, "Roxa");
	}
	
	@Test
	@DisplayName("Testando getter e setter do ID")
	void testId() {
		veiculo.setId(2L);
		//Assert
		assertEquals(2L,veiculo.getId());
	}
	
	@Test
	@DisplayName("Testando getter e setter da MARCA")
	void testMarca() {
		//Act
		veiculo.setMarca("Bugatti");
		//Assert
		assertEquals("Bugatti", veiculo.getMarca());
	}
	@Test
	@DisplayName("Testando getter e setter do MODELO")
	void testModelo() {
		//Act
		veiculo.setModelo("Chiron");
		//Assert
		assertEquals("Chiron", veiculo.getModelo());
	}
	@Test
	@DisplayName("Testando getter e setter do Cor")
	void testCor() {
		//Act
		veiculo.setCor("Preto");
		//Assert
		assertEquals("Preto", veiculo.getCor());
	}
	
	@Test
	@DisplayName("Testando todos os argumentos")
	void testConstrutor() {
		//Act
		Veiculo novoVeiculo = new Veiculo(3L,"Ferrari", "F80", 2020, "Vermelha");
		//Assert
		assertAll("novoVeiculo",
				()-> assertEquals(3L,novoVeiculo.getId()),
				()-> assertEquals("Ferrari",novoVeiculo.getMarca()),
				()-> assertEquals("F80",novoVeiculo.getModelo()),
				()-> assertEquals(2020,novoVeiculo.getAno()),
				()-> assertEquals("Vermelha",novoVeiculo.getCor()));
	}
}

