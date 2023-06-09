package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ContaTest {

    @Test
    void deveArmazenarEstados() {
        Conta conta = new Conta();
        conta.setEstado(ContaFantasma.getInstance());
        conta.setEstado(ContaInativa.getInstance());
        assertEquals(2, conta.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Conta conta = new Conta();
        conta.setEstado(ContaFantasma.getInstance());
        conta.setEstado(ContaInativa.getInstance());
        conta.restauraEstado(0);
        assertEquals(ContaFantasma.getInstance(), conta.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Conta conta = new Conta();
            conta.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}