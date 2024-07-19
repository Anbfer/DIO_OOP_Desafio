package com.bank;

import lombok.Getter;

@Getter
public class Conta implements OperacoesConta {

    private static final int AGENCIA_PADRAO = 001;

    private int agencia;
    private int nrmConta = 1;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.nrmConta = nrmConta++;
        this.cliente = cliente;
        cliente.infoConta();
        this.extrato();
    }

    @Override
    public void sacar(double valor) {
        String resposta = valor > this.getSaldo() ? "Valor Insuficiente, saque não realizado" : "Saque realizado no valor de R$:" + valor;
        saldo -= valor;
        System.out.println(resposta);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, String contaDestino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }

    @Override
    public void extrato() {
        System.out.println("\n*-=-={ Extrato }=-=-*");
        System.out.println("Agência: " + this.getAgencia() + " Conta: " + this.getNrmConta());
        System.out.println("Saldo: " + this.getSaldo() + "\n");
    }

}
