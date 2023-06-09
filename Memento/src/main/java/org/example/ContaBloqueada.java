package org.example;

public class ContaBloqueada implements ContaEstado {

    private ContaBloqueada() {};
    private static ContaBloqueada instance = new ContaBloqueada();
    public static ContaBloqueada getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Conta Bloqueada pois o usuário não seguiu os termos de uso";
    }

}
