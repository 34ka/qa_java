package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensReturnsCorrectKittens() throws Exception {

        Mockito.when(feline.getKittens(0)).thenReturn(2);
        Alex alex = new Alex(feline);

        int expectedCount = 2;
        int actualCount = alex.getKittens();

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getFriendsReturnsCorrectFriends() throws Exception {

        Alex alex = new Alex(feline);

        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        List<String> actualFriends = alex.getFriends();

        assertEquals(expectedFriends, actualFriends);
    }

    @Test
    public void getPlaceReturnsCorrectPlace() throws Exception {

        Alex alex = new Alex(feline);

        String expectedPlace = "Нью-Йоркский Зоопарк";
        String actualPlace = alex.getPlace();

        assertEquals(expectedPlace, actualPlace);
    }
}