package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test

    public void eatMeatForAnimalKind() throws Exception {

        Feline feline = new Feline();
        Mockito.when(feline.getFood("Хищник")).thenReturn((List.of("Животные", "Птицы", "Рыба")));

        List<String> expectedMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMeat = feline.eatMeat();

        assertEquals(expectedMeat, actualMeat);
    }

    @Test
    public void getFamilyReturnsCorrectFeline() {

        Feline feline = new Feline();

        String expectedFeline = "Кошачьи";
        String actualFeline = feline.getFamily();

        assertEquals(expectedFeline, actualFeline);
    }

    @Test
    public void getKittensReturnsCorrectKittens() {

        Feline feline = spy(new Feline());
        Mockito.when(feline.getKittens()).thenReturn(0);

        int expectedKittens = 0;
        int actualKittens = feline.getKittens();


        assertEquals(expectedKittens, actualKittens);

    }

    @Test
    public void getKittensReturnsCorrectKittensCount() {

        Feline feline = new Feline();

        int expectedCount = 0;
        int actualCount = feline.getKittens(0);

        assertEquals(expectedCount, actualCount);
    }
}