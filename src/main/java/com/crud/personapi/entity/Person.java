package com.crud.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

/***
 * 
 * @author Romoaldo Doliz
 * @Entity Person representa uma entidade no banco de dados
 * @Data responsavel por gerar os get/set
 * @Builder responsavel por uma contrução de objetos utilizando padrão
 * @AllArgsConstructor e @NoArgsConstructor responsavel por inserir os contrutores
 *  
 * 
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String Estadocivil;

    @Column(nullable = false, unique = true)
    private String BI;

    @Column(nullable = false, unique = true)
    private String NUIT;

    @Column(nullable = false)
    private String Endereco;

    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phones;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Email> emails;
}
