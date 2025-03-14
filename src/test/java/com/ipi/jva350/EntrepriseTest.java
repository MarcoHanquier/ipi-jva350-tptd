package com.ipi.jva350;

import com.ipi.jva350.model.Entreprise;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class EntrepriseTest {

    @Test
    void testEstDansPlageDateDansIntervalle() {
        // Given
        LocalDate date = LocalDate.of(2024, 3, 14);
        LocalDate debut = LocalDate.of(2024, 3, 10);
        LocalDate fin = LocalDate.of(2024, 3, 20);

        // When
        boolean result = Entreprise.estDansPlage(date, debut, fin);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    void testEstDansPlageDateEgaleDebut() {
        // Given
        LocalDate date = LocalDate.of(2024, 3, 10);
        LocalDate debut = LocalDate.of(2024, 3, 10);
        LocalDate fin = LocalDate.of(2024, 3, 20);

        // When
        boolean result = Entreprise.estDansPlage(date, debut, fin);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    void testEstDansPlageDateEgaleFin() {
        // Given
        LocalDate date = LocalDate.of(2024, 3, 20);
        LocalDate debut = LocalDate.of(2024, 3, 10);
        LocalDate fin = LocalDate.of(2024, 3, 20);

        // When
        boolean result = Entreprise.estDansPlage(date, debut, fin);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    void testEstDansPlageDateAvant() {
        // Given
        LocalDate date = LocalDate.of(2024, 3, 5);
        LocalDate debut = LocalDate.of(2024, 3, 10);
        LocalDate fin = LocalDate.of(2024, 3, 20);

        // When
        boolean result = Entreprise.estDansPlage(date, debut, fin);

        // Then
        Assertions.assertFalse(result);
    }

    @Test
    void testEstDansPlageDateApres() {
        // Given
        LocalDate date = LocalDate.of(2024, 3, 25);
        LocalDate debut = LocalDate.of(2024, 3, 10);
        LocalDate fin = LocalDate.of(2024, 3, 20);

        // When
        boolean result = Entreprise.estDansPlage(date, debut, fin);

        // Then
        Assertions.assertFalse(result);
    }



}
