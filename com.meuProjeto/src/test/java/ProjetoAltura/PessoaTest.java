package ProjetoAltura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import entities.Pessoa;

class PessoaTest {

	@Test
	@DisplayName("Deve lancar excecao ao passar nome nulo")
	void testNomeNulo() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			new Pessoa(null, 20, 1.75);
		});

		assertEquals("Nome nao pode ser nulo ou vazio.", exception.getMessage());
	}

	@Test
	@DisplayName("Deve lançar exceção ao passar nome vazio")
	void testNomeVazio() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			new Pessoa("", 20, 1.75);
		});

		assertEquals("Nome nao pode ser nulo ou vazio.", exception.getMessage());
	}

	@Test
	@DisplayName("Test de realizar o calculo da altura media")
	void testCalcularAlturaMedia() {
		Pessoa[] pessoas = { new Pessoa("João", 20, 1.75), new Pessoa("Maria", 22, 1.65),
				new Pessoa("Pedro", 18, 1.80) };
		double alturaMedia = Pessoa.calcularAlturaMedia(pessoas);
		assertEquals(1.7333, alturaMedia, 0.0001);
	}

	@Test
	@DisplayName("Test de realizar o calculo de percentual de menores de 16")
	void testCalcularPercentualMenoresDe16() {
		Pessoa[] pessoas = { new Pessoa("João", 15, 1.75), new Pessoa("Maria", 22, 1.65), new Pessoa("Pedro", 18, 1.80),
				new Pessoa("Ana", 14, 1.60) };
		double percentual = Pessoa.calcularPercentualMenoresDe16(pessoas);
		assertEquals(50.0, percentual, 0.001);
	}

}