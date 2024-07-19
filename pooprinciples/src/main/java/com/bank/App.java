package com.bank;

public class App {
    public static void main(String[] args) {

        Banco banco = new Banco();
        PessoaFisica cliente1 = new PessoaFisica("Angelo Baracho", "477.717.428-07");
        ContaCorrente cc1 = new ContaCorrente(cliente1, banco);
        cc1.depositar(1000);
        cc1.sacar(1001);


        PessoaJuridica empresa1 = new PessoaJuridica("DIO Corp.", "83.857.314/0001-32");
        ContaCorrente cc2 = new ContaCorrente(empresa1, banco);

    }
}
