package com.tod01.healthservice.application.domain;

import java.time.LocalDate;
import java.util.UUID;

import com.tod01.healthservice.application.domain.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Person {
    
    private UUID id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Gender gender;
}
