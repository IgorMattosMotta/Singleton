package br.com.estudos.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class SenhaAtendimentoTest {

    @Test
    void doisGuichesUsamOMesmoContadorDeSenhas() {
        SenhaAtendimento guicheUm = SenhaAtendimento.getInstance();
        SenhaAtendimento guicheDois = SenhaAtendimento.getInstance();

        assertSame(guicheUm, guicheDois);

        int senha = guicheUm.proxima();

        assertEquals(senha + 1, guicheDois.proxima());
        assertEquals(senha + 1, guicheUm.ultima());
    }
}
