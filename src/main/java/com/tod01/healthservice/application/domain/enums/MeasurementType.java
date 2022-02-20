package com.tod01.healthservice.application.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MeasurementType {
    
    HEART_RATE("Heart Rate", "BPM");
    OXYGEN_SATURATION("Oxygen Saturn Generation", "%");
}
