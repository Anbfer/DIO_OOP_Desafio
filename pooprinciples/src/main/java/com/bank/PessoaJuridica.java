package com.bank;

import lombok.Generated;
import lombok.NonNull;

@Generated
public class PessoaJuridica extends Cliente{

    public PessoaJuridica(String instituicao, String cnpj) {
        novoClienteFisico(instituicao, cnpj);
    }

    @NonNull
    public void novoClienteFisico(String instituicao, String cnpj){
        this.setNomeCliente(instituicao);
        this.setNumeroDocumento(cnpj);
    }
    
}
