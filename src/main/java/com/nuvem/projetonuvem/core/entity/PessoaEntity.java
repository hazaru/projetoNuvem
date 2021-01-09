package com.nuvem.projetonuvem.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PessoaEntity {

    private String nome;
    private String sobreNome;
    private String CPF;

}
