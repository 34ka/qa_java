package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean expectedResult;

    public LionParameterizedTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void constructorReturnsCorrectSex() throws Exception {

        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);

        boolean actual = lion.doesHaveMane();
        boolean expected = expectedResult;

        assertEquals(expected, actual);
    }
}