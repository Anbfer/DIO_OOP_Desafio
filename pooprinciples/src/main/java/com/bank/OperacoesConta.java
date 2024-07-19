package com.bank;

public interface OperacoesConta {

    public void sacar(double valor);
    public void depositar(double valor);
    public void transferir(double valor, String nmrDocumento);
    public void extrato();
    
}