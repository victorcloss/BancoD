package org.closs.banco.contas;

public abstract class Conta {
    private static int AGENCIA_PADRAO = 3451;
    private static int SEQUENCIAL = 1; 
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }    

    public void sacar(double valor){
        saldo -= valor;
    }
    public void transferir(double valor, Conta contaDestino){
        this.saldo-=valor;
        contaDestino.saldo += valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public abstract void imprimirExtrato();

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", cliente.getNomeCompleto()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Conta: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}
