package com.hu.backend.entities.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PacienteSexo {
    M("Masculino"),
    F("Feminino");

    private final String label;

    PacienteSexo(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return this.label;
    }

    @Override
    public String toString() {
        return label;
    }
}
