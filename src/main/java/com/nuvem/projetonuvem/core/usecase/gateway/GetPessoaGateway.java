package com.nuvem.projetonuvem.core.usecase.gateway;

import com.nuvem.projetonuvem.core.entity.PessoaEntity;
import com.nuvem.projetonuvem.entrypoint.model.response.GetPessoaResponse;

import java.util.List;

public interface GetPessoaGateway {

    List<GetPessoaResponse> getPessoa() throws Exception;

    /*PessoaEntity getOne(String CPF);*/

}
