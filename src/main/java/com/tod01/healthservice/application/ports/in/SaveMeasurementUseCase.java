package com.tod01.healthservice.application.ports.in;

import com.tod01.healthservice.application.domain.Measurement;

import reactor.core.publisher.Mono;

public interface SaveMeasurementUseCase {
    Mono<Measurement> save(Measurement measurement);
}
