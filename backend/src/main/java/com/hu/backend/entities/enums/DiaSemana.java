package com.hu.backend.entities.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DiaSemana {
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira");

    private final String label;

    DiaSemana(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
}
