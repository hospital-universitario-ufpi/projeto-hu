package com.hu.backend.entities.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RespostaTratamento {
    COMPLETA("Completa"),
    PARCIAl("Parcial"),
    SEM_RESPOSTA("Sem resposta"),
    PIORA_PROGRESSAO("Piora/Progressao");

    private final String label;

    RespostaTratamento(String label) {
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
