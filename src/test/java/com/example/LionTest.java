package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void doesHaveManeReturnsExceptionUnknownGender() throws Exception {

        Lion lion = new Lion("4r4rа", feline);
    }

    @Test
    public void getKittensReturnsCorrectKittens() throws Exception {

        Mockito.when(feline.getKittens()).thenReturn(0);
        Lion lion = new Lion("Самец", feline);

        int expectedCount = 0;
        int actualCount = lion.getKittens();

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void doesHaveManeReturnTrueHasMane()  throws Exception {

        Lion lion = new Lion("Самец", feline);
        boolean expectedMane = true;
        boolean actualMane = lion.doesHaveMane();

        assertEquals(expectedMane, actualMane);
    }

    @Test
    public void getFoodReturnsCorrectFood() throws Exception {

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();

        assertEquals(expectedFood, actualFood);
    }
}