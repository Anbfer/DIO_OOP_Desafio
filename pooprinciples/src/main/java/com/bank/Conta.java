package com.bank;

import lombok.Getter;

@Getter
public class Conta implements OperacoesConta {

    private static final int AGENCIA_PADRAO = 001;
    private static int NMR_CONTA = 1;

    private int agencia;
    private int nmrConta;
    private double saldo;
    private Banco banco;
    private Cliente cliente;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.nmrConta = Conta.NMR_CONTA++;
        this.cliente = cliente;
        banco.addConta(this);
    }

    @Override
    public void sacar(double valor) {

        if (valor > 0) {
            boolean podeRealizar = verificaSaldo(valor);

            if (podeRealizar) {
                saldo -= valor;
            }

            String resposta = podeRealizar ? "Operação realizada"
                    : "Saldo de R$" + this.getSaldo() + " insuficiente para operação. Operação não realizada";

            System.out.println(resposta);
            cliente.infoConta();
            this.extrato();
        }

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        this.extrato();
    }

    @Override
    public void transferir(double valor, String nmrDocumentoDestino) {
        Conta contaDestino = buscaContaDestino(nmrDocumentoDestino);

        if (contaDestino != null) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Conta de destino não encontrada");
        }
    }

    @Override
    public void extrato() {
        System.out.println("\n*-=-={ Extrato }=-=-*");
        System.out.println("Agência: " + this.getAgencia() + " Conta: " + this.getNmrConta());
        System.out.println("Saldo: " + this.getSaldo() + "\n");
    }

    private Conta buscaContaDestino(String nmrDocumentoDestino) {
        Conta contaDestino = null;

        for (Conta conta : banco.getContas()) {
            if (conta.getCliente().getNumeroDocumento().contentEquals(nmrDocumentoDestino)) {
                contaDestino = conta;
                break;
            }
        }

        return contaDestino;
    }

    private boolean verificaSaldo(double valor) {
        boolean resposta = valor < this.getSaldo() && valor > 0 ? true : false;
        return resposta;
    }

}
