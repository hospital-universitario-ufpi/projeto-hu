package com.hu.backend.entities.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ExameTipo{
    EXAME_ANATOMOPATOLOGICO("Exame anatomopatológico"),
    IMUNO_HISTOQUIMICA("Imuno-histoquímica"),
    FAN("FAN"),
    FUNCAO_RENAL("Função renal"),
    FUNCAO_HEPATICA("Função hepática"),
    VITAMINA_D("Vitamina D"),
    OUTROS("Outros");

    private final String label;

    ExameTipo(String label) {
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
