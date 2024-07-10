package com.example;

import lombok.Builder;

public class ContaPoupanca extends Conta {
	
	@Builder(builderMethodName = "ContaPoupanca")
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
