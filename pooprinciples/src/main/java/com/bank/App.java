package com.bank;

public class App {
    public static void main(String[] args) {
        PessoaFisica cliente1 = new PessoaFisica("Angelo Baracho", "477.717.428-07");

        PessoaJuridica empresa1 = new PessoaJuridica("DIO Corp.", "83.857.314/0001-32");

        Conta cc1 = new ContaCorrente(cliente1);
        cc1.depositar(100);
        cc1.extrato();

        Conta cc2 = new ContaCorrente(empresa1);
        cc2.depositar(200);
        cc2.extrato();
        cc2.sacar(201);


    }
}
