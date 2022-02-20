package com.tod01.healthservice.application.ports.in;

import com.tod01.healthservice.application.domain.Person;

import reactor.core.publisher.Mono;

public interface SavePersonUseCase {
    
    Mono<Person> save(Person person);
}
