package com.ipi.jva350;

import com.ipi.jva350.model.SalarieAideADomicile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.LinkedHashSet;

public class SalarieAideADomicileTest {
    @Test
    void testALegalementDroitADesCongesPayes() {
        // Given
        SalarieAideADomicile s = new SalarieAideADomicile();
        // When
        boolean res = s.aLegalementDroitADesCongesPayes();
        s.setJoursTravaillesAnneeNMoins1(1);
        // Then
        Assertions.assertFalse(res);
    }

    @Test
void testALegalementDroitADesCongesPayesTrue(){
    SalarieAideADomicile s = new SalarieAideADomicile();
    s.setJoursTravaillesAnneeNMoins1(100);
}

    @Test
void testCalculeJoursDeCongeDecomptesPourPlage(){

    // Given
    SalarieAideADomicile s = new SalarieAideADomicile();
    // When
    LinkedHashSet<LocalDate> res = s.calculeJoursDeCongeDecomptesPourPlage(LocalDate.parse("2022-11-01"),
            LocalDate.parse("2022-11-01"));
    // Then
    Assertions.assertNotNull(res);

//    SalarieAideADomicile s = new SalarieAideADomicile();
//    boolean res = s.aLegalementDroitADesCongesPayes();
//    s.setJoursTravaillesAnneeNMoins1(1);
//    Assertions.assertFalse(res);

}


}



