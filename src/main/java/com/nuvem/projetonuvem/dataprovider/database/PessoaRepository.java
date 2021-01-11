package com.nuvem.projetonuvem.dataprovider.database;

import com.nuvem.projetonuvem.dataprovider.database.entity.PessoaTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaTable, Long>, JpaSpecificationExecutor<PessoaTable> {

    @Query(value =
            "select * from pessoa where cpf = :cpf ",
            nativeQuery = true)
            PessoaTable findOne(@Param(value = "cpf") String cpf);

    @Query(value = "select * from pessoa", nativeQuery = true)
    List<PessoaTable> getAllPessoa();


}
