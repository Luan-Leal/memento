package org.example;

public class ContaFantasma implements ContaEstado {

    private ContaFantasma() {};
    private static ContaFantasma instance = new ContaFantasma();
    public static ContaFantasma getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Essa conta não apresenta evidencia que é usada por uma pessoa ";
    }

}
