package com.hu.backend.utils;

import java.time.Duration;

public class DurationUtil {

    public static Duration parseDuration(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("O tempo de exposição não pode ser vazio.");
        }

        String[] parts = input.split(",");
        if (parts.length != 2) {
            throw new IllegalArgumentException("O formato deve ser 'minutos,segundos' (ex.: 1,30).");
        }

        try {
            int minutos = Integer.parseInt(parts[0].trim());
            int segundos = Integer.parseInt(parts[1].trim());

            if (segundos < 0 || segundos >= 60) {
                throw new IllegalArgumentException("Os segundos devem estar entre 0 e 59.");
            }

            return Duration.ofMinutes(minutos).plusSeconds(segundos);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Minutos e segundos devem ser números inteiros.", e);
        }
    }
}
