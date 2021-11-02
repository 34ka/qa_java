package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {
    private final String actualAnimalKind;
    private final List<String> expectedResult;

    public AnimalParameterizedTest(String actualAnimalKind, List<String> expectedResult) {
        this.actualAnimalKind = actualAnimalKind;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodReturnsCorrectFood() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFood = expectedResult;
        List<String> actualFood = animal.getFood(actualAnimalKind);

        assertEquals(expectedFood, actualFood);
    }
}