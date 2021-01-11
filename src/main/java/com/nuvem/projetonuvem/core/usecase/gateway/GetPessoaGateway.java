package com.nuvem.projetonuvem.core.usecase.gateway;

import com.nuvem.projetonuvem.configuration.exception.handler.BusinessException;
import com.nuvem.projetonuvem.core.entity.PessoaEntity;
import com.nuvem.projetonuvem.entrypoint.model.response.GetPessoaResponse;

import java.util.List;

public interface GetPessoaGateway {

    List<PessoaEntity> getPessoa() throws BusinessException;

    /*PessoaEntity getOne(String CPF);*/

}
