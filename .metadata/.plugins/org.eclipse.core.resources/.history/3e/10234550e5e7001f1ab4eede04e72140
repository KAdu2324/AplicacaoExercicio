package ExercicioAltura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PessoaTest {

    @Test
    void testGetNome() {
        Pessoa pessoa = new Pessoa("João", 20, 1.75);
        assertEquals("João", pessoa.getNome());
    }

    @Test
    void testSetNome() {
        Pessoa pessoa = new Pessoa("João", 20, 1.75);
        pessoa.setNome("Maria");
        assertEquals("Maria", pessoa.getNome());
    }

    @Test
    void testGetIdade() {
        Pessoa pessoa = new Pessoa("João", 20, 1.75);
        assertEquals(20, pessoa.getIdade());
    }

    @Test
    void testSetIdade() {
        Pessoa pessoa = new Pessoa("João", 20, 1.75);
        pessoa.setIdade(25);
        assertEquals(25, pessoa.getIdade());
    }

    @Test
    void testGetAltura() {
        Pessoa pessoa = new Pessoa("João", 20, 1.75);
        assertEquals(1.75, pessoa.getAltura(), 0.001);
    }

    @Test
    void testSetAltura() {
        Pessoa pessoa = new Pessoa("João", 20, 1.75);
        pessoa.setAltura(1.80);
        assertEquals(1.80, pessoa.getAltura(), 0.001);
    }

    @Test
    void testCalcularAlturaMedia() {
        Pessoa[] pessoas = {
            new Pessoa("João", 20, 1.75),
            new Pessoa("Maria", 22, 1.65),
            new Pessoa("Pedro", 18, 1.80)
        };
        double alturaMedia = Pessoa.calcularAlturaMedia(pessoas);
        assertEquals(1.7333, alturaMedia, 0.0001);
    }

    @Test
    void testCalcularPercentualMenoresDe16() {
        Pessoa[] pessoas = {
            new Pessoa("João", 15, 1.75),
            new Pessoa("Maria", 22, 1.65),
            new Pessoa("Pedro", 18, 1.80),
            new Pessoa("Ana", 14, 1.60)
        };
        double percentual = Pessoa.calcularPercentualMenoresDe16(pessoas);
        assertEquals(50.0, percentual, 0.001);
    }
}