package com.beto.actions.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "action")
@RequiredArgsConstructor
public class ActionController {

    @GetMapping
    public String incrementarGauge() {
        return "Gauge incrementado! Valor atual: ";
    }
    
}
