package com.nuvem.projetonuvem.dataprovider.mapper;

import com.nuvem.projetonuvem.core.entity.PessoaEntity;
import com.nuvem.projetonuvem.dataprovider.database.entity.PessoaTable;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;


@Mapper(componentModel="spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface GetPessoaEntityMapper {

    default PessoaEntity toEntity(PessoaTable pessoaTable) {
        PessoaEntity entity = new PessoaEntity();

        if (pessoaTable != null) {
            entity = PessoaEntity
                    .builder()
                    .CPF(pessoaTable.getCPF())
                    .nome(pessoaTable.getNome())
                    .sobreNome(pessoaTable.getSobreNome())
                    .build();
        }
        return entity;
    }

    List<PessoaEntity> toEntities(List<PessoaTable> pessoaTables);

}
