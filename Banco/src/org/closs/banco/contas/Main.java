package org.closs.banco.contas;



public class Main {
    public static void main(String[] args) {
        Cliente victor = new Cliente();
        victor.setNomeCompleto("Victor");

        Conta cc = new ContaCorrente(victor);
        Conta poupanca = new ContaPoupanca(victor);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
