package com.nuvem.projetonuvem.core.usecase;

import com.nuvem.projetonuvem.configuration.exception.handler.BusinessException;
import com.nuvem.projetonuvem.core.entity.PessoaEntity;
import com.nuvem.projetonuvem.core.usecase.gateway.GetPessoaGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetPessoaUseCase {

    //private static final Logger logger = LoggerFactory.getLogger(GetPessoaUseCase.class);

    private final GetPessoaGateway gateway;

    public List<PessoaEntity> getAllPessoas() throws BusinessException {

            return this.gateway.getPessoa();


    }

}
