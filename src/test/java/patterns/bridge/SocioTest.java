package patterns.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocioTest {

    @Test
    void deveRetornarSalarioSocioComEnsinoMedio() {
        Escolaridade escolaridade = new EnsinoMedio();
        Socio socio = new Socio(2000.0f);
        socio.setEscolaridade(escolaridade);
        assertEquals(2000.0f, socio.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSocioComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        Socio socio = new Socio(2000.0f);
        socio.setEscolaridade(escolaridade);
        assertEquals(2200.0f, socio.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSocioComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        Socio socio = new Socio(2000.0f);
        socio.setEscolaridade(escolaridade);
        assertEquals(2400.0f, socio.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSocioComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        Socio socio = new Socio(2000.0f);
        socio.setEscolaridade(escolaridade);
        assertEquals(2600.0f, socio.calcularSalario(), 0.01f);
    }

}
