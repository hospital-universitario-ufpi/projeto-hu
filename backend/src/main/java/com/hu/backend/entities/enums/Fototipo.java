package com.hu.backend.entities.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Fototipo {
    PELE_BRANCA("Pele Branca"),
    PELE_MORENA_CLARA("Pele Morena Clara"),
    PELE_MORENA_MODERADA("Pele Morena Moderada"),
    PELE_MORENA_ESCURA("Pele Morena Escura"),
    PELE_NEGRA("Pele Negra");

    private final String label;

    Fototipo(String label) {
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
