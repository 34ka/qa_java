package com.example;

import org.junit.Test;

import static org.junit.Assert.*;


public class AnimalTest {

    @Test(expected = Exception.class)
    public void getFoodReturnsExceptionFoodForUnknownAnimalKind() throws Exception {

        Animal animal = new Animal();
        animal.getFood("kktyukty");
    }

    @Test
    public void getFamilyReturnsCorrectFamily() {

        Animal animal = new Animal();

        String expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualFamily = animal.getFamily();

        assertEquals(expectedFamily, actualFamily);
    }
}