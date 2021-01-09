package com.nuvem.projetonuvem.core.usecase;

import com.nuvem.projetonuvem.core.entity.PessoaEntity;
import com.nuvem.projetonuvem.core.usecase.gateway.GetPessoaGateway;
import com.nuvem.projetonuvem.entrypoint.model.response.GetPessoaResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetPessoaUseCase {

    private static final Logger logger = LoggerFactory.getLogger(GetPessoaUseCase.class);

    private final GetPessoaGateway gateway;

    public List<GetPessoaResponse> getAllPessoas() throws Exception {

            return this.gateway.getPessoa();


    }

}
