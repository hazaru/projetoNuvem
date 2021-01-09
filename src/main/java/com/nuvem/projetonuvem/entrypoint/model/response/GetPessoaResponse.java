package com.nuvem.projetonuvem.entrypoint.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPessoaResponse {

    private String nome = "Rafael";
    private String sobreNome = "Cruz";
    private String CPF = "010-375-225.08";

}
