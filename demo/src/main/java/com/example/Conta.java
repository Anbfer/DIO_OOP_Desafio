package com.example;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;


@ToString
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	@Getter
	protected int agencia;
	
	@Getter
	protected int numero;

	@Getter
	protected double saldo;

	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	@NonNull
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	@NonNull
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	@NonNull
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
