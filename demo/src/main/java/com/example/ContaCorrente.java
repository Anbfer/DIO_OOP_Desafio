package com.example;

import lombok.Builder;

public class ContaCorrente extends Conta {

	@Builder(builderMethodName = "ContaCorrente")
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
