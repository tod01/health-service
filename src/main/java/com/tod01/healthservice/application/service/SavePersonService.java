package com.tod01.healthservice.application.service;

import com.tod01.healthservice.application.domain.Person;
import com.tod01.healthservice.application.ports.in.SavePersonUseCase;
import com.tod01.healthservice.common.UseCase;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@UseCase
@RequiredArgsConstructor
public class SavePersonService implements SavePersonUseCase {
    
    private final SavePersonUseCase port;

    @Override
    public Mono<Person> save(Person person) {
        return this.port.save(person);
    }
}
