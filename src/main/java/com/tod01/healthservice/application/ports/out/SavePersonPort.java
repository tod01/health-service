package com.tod01.healthservice.application.ports.out;

import com.tod01.healthservice.application.domain.Person;

import reactor.core.publisher.Mono;

public interface SavePersonPort {

    Mono<Person> save(Person person);

}