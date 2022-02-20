package com.tod01.healthservice.application.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import java.util.stream.Stream;

@Getter
@RequiredArgsConstructor
public enum MeasurementType {
    
    HEART_RATE("Heart Rate", "BPM"),
    OXYGEN_SATURATION("Oxygen Saturn Generation", "%"),
    BLOOD_GLUCOSE("Blood Glucose", "mg/dL"),
    BLOOD_PRESSURE("Blood Pressure", "mmHg"),
    TEMPERATURE("Temperature", "°C");

    private final String description;
    private final String unitOfMeasurement;

    public MeasurementType fromDescription(String description) {
        return Stream.of(MeasurementType.values())
                    .filter(measurementType -> measurementType.getDescription().equals(description))
                    .findFirst()
                    .orElse(null);
    }

}
