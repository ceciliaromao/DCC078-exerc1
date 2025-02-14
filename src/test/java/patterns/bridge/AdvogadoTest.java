package patterns.bridge;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import static org.junit.jupiter.api.Assertions.*;

class AdvogadoTest {

    @Test
    void deveRetornarSalarioAdvogadoComEnsinoMedio() {
        Escolaridade escolaridade = new EnsinoMedio();
        Advogado advogado = new Advogado(50.0f);
        advogado.setEscolaridade(escolaridade);
        advogado.setNumCasos(2);
        assertEquals(100.0f, advogado.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdvogadoComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        Advogado advogado = new Advogado(50.0f);
        advogado.setEscolaridade(escolaridade);
        advogado.setNumCasos(2);
        assertEquals(110.0f, advogado.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdvogadoComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        Advogado advogado = new Advogado(50.0f);
        advogado.setEscolaridade(escolaridade);
        advogado.setNumCasos(2);
        assertEquals(120.0f, advogado.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdvogadoComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        Advogado advogado = new Advogado(50.0f);
        advogado.setEscolaridade(escolaridade);
        advogado.setNumCasos(2);
        assertEquals(130.0f, advogado.calcularSalario(), 0.01f);
    }

}
