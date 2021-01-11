package com.nuvem.projetonuvem.dataprovider;

import com.nuvem.projetonuvem.core.entity.PessoaEntity;
import com.nuvem.projetonuvem.core.usecase.gateway.GetPessoaGateway;
import com.nuvem.projetonuvem.core.util.MessageUtil;
import com.nuvem.projetonuvem.dataprovider.database.PessoaRepository;
import com.nuvem.projetonuvem.dataprovider.mapper.GetPessoaEntityMapper;
import com.nuvem.projetonuvem.entrypoint.model.response.GetPessoaResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class GetPessoaDataProvider implements GetPessoaGateway {

    //private static final Logger logger = LoggerFactory.getLogger(MessageUtil.GET_PESSOA_CHAMANDO_DATAPROVIDER);

    private final PessoaRepository repository;

    private final GetPessoaEntityMapper mapper;


    @Override
    public List<PessoaEntity> getPessoa() {

        return mapper.toEntities(repository.getAllPessoa());
    }

   /* @Override
    public PessoaEntity getOne(String CPF) {

        return mapper.toEntity(repository.findOne(CPF));
    }*/
}
