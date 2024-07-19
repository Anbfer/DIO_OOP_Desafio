package com.bank;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Banco {
    private List<Conta> contas;

    Banco(){
        this.contas = new ArrayList<>();
    }

    @NonNull
    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public void printContas() {
        System.out.println("\n--- Lista de Contas ---");
        for (Conta conta : contas) {
            System.out.println("Conta: " + conta.getNmrConta());
            System.out.println(" Cliente: " + conta.getCliente().getNomeCliente());
            System.out.println(" Saldo: " + conta.getSaldo());
            System.out.println("-----------------------");
        }
    }
}
