package com.tukorea.ns_baragi_server.weather;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherSurveyDTO {
    public Integer serialNumber;
    public Integer value;
}
