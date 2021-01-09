package com.nuvem.projetonuvem.dataprovider.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="PESSOA")
public class PessoaTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CPF")
    private String CPF;
    @Column(name="NOME")
    private String nome;
    @Column(name="SOBRENOME")
    private String sobreNome;

}
