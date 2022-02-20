package com.tod01.healthservice.application.service;

import com.tod01.healthservice.application.domain.Measurement;
import com.tod01.healthservice.application.ports.in.SaveMeasurementUseCase;
import com.tod01.healthservice.common.UseCase;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@UseCase
@RequiredArgsConstructor
public class SaveMeasurementService implements SaveMeasurementUseCase {
    
    private final SaveMeasurementPort port;

    @Override
    public Mono<Measurement> save(Measurement measurement) {
        return this.port.save(measurement);
    }
}
