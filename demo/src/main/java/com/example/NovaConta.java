package com.example;

import java.util.Scanner;

public class NovaConta {
    Scanner input = new Scanner(System.in);

    String nomeCliente = input.next();
    Cliente novoCliente = new Cliente(nomeCliente);

}
