package com.nuvem.projetonuvem.entrypoint.mapper;

import com.nuvem.projetonuvem.core.entity.PessoaEntity;
import com.nuvem.projetonuvem.entrypoint.model.response.GetPessoaResponse;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface GetPessoaHttpMapper {

    GetPessoaResponse toResponse(PessoaEntity entity);

    List<GetPessoaResponse> toListResponse(List<PessoaEntity> entities);
}
