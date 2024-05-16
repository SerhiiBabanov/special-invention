package com.example.api;

import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public ResponseEntity<PlaneDto> get() {
        return ResponseEntity.ok(PlaneDto.builder()
                .name("Boeing 747")
                .capacity(366)
                .build());
    }
}
