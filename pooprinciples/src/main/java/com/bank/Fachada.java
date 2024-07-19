package com.bank;

import java.util.Scanner;

public class Fachada {

    String nomeCliente, resposta;

    Scanner input = new Scanner(System.in);

    public void novoCliente() {
        System.out.println("Informe o nome do novo cliente: ");
        nomeCliente = input.next();

        System.out.println("O nome do cliente realmente é " + nomeCliente + "? | S ou N: ");
        resposta = input.next();

        while (resposta.toLowerCase().equals("n")) {
            System.out.println("Informe o nome correto: ");
            nomeCliente = input.next();
            System.out.println("Confirma? S | N");
            resposta = input.next();
        }
    }

}
