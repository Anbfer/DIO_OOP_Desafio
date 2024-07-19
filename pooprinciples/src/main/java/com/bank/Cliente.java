package com.bank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    private String nomeCliente;
    private String numeroDocumento;
    private String tipoConta;

    private String identificaTipoConta() {

        this.tipoConta = this instanceof PessoaFisica ? "Pessoa Física" : "Pessoa Jurídica";

        return this.tipoConta;
    }

    public void infoConta() {
        System.out.println("Titular: " + this.getNomeCliente());
        System.out.println("Nrm. Documento: " + this.getNumeroDocumento());
        System.out.println("Tipo de Conta: " + identificaTipoConta());

    }

}
