package com.tod01.healthservice.application.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class Measurement {
    private Long id;
    private Person person;
    private MeasurementType type;
    private LocalDateTime measuredAt;
    private Double value;
    private LocalDateTime analyzedAt;
    private MeasurementClassification classification;
}
