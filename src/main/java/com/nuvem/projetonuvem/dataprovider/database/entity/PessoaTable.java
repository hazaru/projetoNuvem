package com.nuvem.projetonuvem.dataprovider.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Table("PESSOA")
@NamedEntityGraph(name="mercado.pessoa", attributeNodes = @NamedAttributeNode(value="pessoa"))
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
