package com.hu.backend.entities.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PacienteSexo {
    M("M"),
    F("F");

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
