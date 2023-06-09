package org.example;

public class ContaInativa implements ContaEstado {

    private ContaInativa() {};
    private static ContaInativa instance = new ContaInativa();
    public static ContaInativa getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Conta Inativa a mais de 6 meses";
    }

}
