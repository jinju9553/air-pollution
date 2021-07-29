package com.example.dust_navigation.models;

import lombok.Getter;

@Getter
public class AirQualitySensorRequestDto {
    private String device_id;
    private float co;
    private int pm10;
    private int pm25;
    private int air_index;
}
