package com.nuvem.projetonuvem.entrypoint.controller;

import com.nuvem.projetonuvem.configuration.exception.handler.BusinessException;
import com.nuvem.projetonuvem.core.entity.PessoaEntity;
import com.nuvem.projetonuvem.core.usecase.GetPessoaUseCase;
import com.nuvem.projetonuvem.core.usecase.gateway.GetPessoaGateway;
import com.nuvem.projetonuvem.entrypoint.mapper.GetPessoaHttpMapper;
import com.nuvem.projetonuvem.entrypoint.model.response.GetPessoaResponse;
//import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pessoa")
//@Api(value = "GetPessoa", tags = {"GetPessoa"})
public class GetPessoaEndPoint implements GetPessoaGateway {

    //private static final Logger LOGGER = LoggerFactory.getLogger(GetPessoaEndPoint.class);

    @Autowired
    GetPessoaUseCase useCase;

    @Autowired
    GetPessoaHttpMapper httpMapper;
    //private final GetPessoaHttpMapper httpMapper;

    @GetMapping
    public List<PessoaEntity> getPessoa() throws BusinessException {
        //List<GetPessoaResponse> retornaPessoa = httpMapper.toListResponse(useCase.getAllPessoas());
        List<PessoaEntity> pessoaEntities = useCase.getAllPessoas();


            pessoaEntities.add(1, PessoaEntity.builder().build());

            //retornaPessoa =  httpMapper.toResponse(pessoaEntities);


        return pessoaEntities;
    }


    /*@Override
    public List<PessoaEntity> getPessoa() {
        return null;
    }*/
}
