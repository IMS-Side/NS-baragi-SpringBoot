package com.tukorea.ns_baragi_server.cloth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ClothSurveyDTO {
    public Integer serial_number;
    public Integer value;
}
