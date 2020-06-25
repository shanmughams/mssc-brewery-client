package com.shan.springms.msscbreweryclient.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
