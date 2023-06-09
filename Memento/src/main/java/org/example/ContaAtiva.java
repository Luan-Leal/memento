package org.example;

public class ContaAtiva implements ContaEstado {

    private ContaAtiva() {};
    private static ContaAtiva instance = new ContaAtiva();
    public static ContaAtiva getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Conta Ativa";
    }

}

