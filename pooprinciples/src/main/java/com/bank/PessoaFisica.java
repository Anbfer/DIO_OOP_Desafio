package com.bank;

import lombok.Generated;
import lombok.NonNull;

@Generated
public class PessoaFisica extends Cliente{

    public PessoaFisica(String nome, String cpf) {
        novoClienteFisico(nome, cpf);
    }

    @NonNull
    public void novoClienteFisico(String nome, String cpf){
        this.setNomeCliente(nome);
        this.setNumeroDocumento(cpf);
    }
    
}
