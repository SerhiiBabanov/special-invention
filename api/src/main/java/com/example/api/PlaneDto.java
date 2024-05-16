package com.example.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlaneDto {
    private String name;
    private Integer capacity;
}
