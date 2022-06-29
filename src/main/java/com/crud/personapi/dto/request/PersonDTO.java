package com.crud.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

/***
 * 
 * @author Romoaldo Doliz
 * PersonDTO representa os objetos de entradas 
 * 
 * @Data responsavel por gerar os get/set
 * @Builder responsavel por uma contrução de objetos utilizando padrão
 * @AllArgsConstructor e @NoArgsConstructor responsavel por inserir os contrutores
 *  
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String Estadocivil;

    @NotEmpty
    @BI
    private String BI;

    @NotEmpty
    @NUIT
    private String NUIT;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String Endereco;

    private String birthDate;

    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;
    
    private List<EmailDTO> emails;
}
