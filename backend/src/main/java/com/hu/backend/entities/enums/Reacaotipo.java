package com.hu.backend.entities.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Reacaotipo {
    ARDENCIA("Ardência"),
    ERITEMA_LEVE("Eritema Leve"),
    ERITEMA_SEVERO("Eritema Severo"),
    BOLHAS("Bolhas");

    private final String label;

    Reacaotipo(String label) {
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
