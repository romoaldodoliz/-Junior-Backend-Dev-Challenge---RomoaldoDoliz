package com.crud.personapi.utils;

import java.time.LocalDate;
import java.util.Collections;

import com.crud.personapi.dto.request.PersonDTO;
import com.crud.personapi.entity.Person;

public class PersonUtils {

    private static final String FIRST_NAME = "Romoaldo";
    private static final String LAST_NAME = "Doliz";
    private static final String ESTADOCIVIL = "Casado";
    private static final String ENDERECO = "Cidade da Matola";
    private static final String BI = "369.333.878-79";
    private static final String NUIT = "123456788";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10, 1);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .ESTADOCIVIL(ESTADOCIVIL)
                .BI(BI)
                .Endereco(ENDERECO)
                .NUIT(NUIT)
                .birthDate("04-04-2010")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .emails(Collections.singletonList(EmailUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .firstName(FIRST_NAME)
                .ESTADOCIVIL(ESTADOCIVIL)
                .BI(BI)
                .Endereco(ENDERECO)
                .NUIT(NUIT)
                .birthDate("04-04-2010")
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .emails(Collections.singletonList(EmailUtils.createFakeEntity()))
                .build();
    }
}
