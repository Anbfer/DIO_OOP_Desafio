package com.bank;

public interface AcoesConta {
    
    public void getSaldo();
    public void getAgencia();
    public void getNumConta();
    public void getTipoConta();
    public void getTitularConta();
    public double transfereValor();
    public double depositaValor();
    public double sacaValor();
}
