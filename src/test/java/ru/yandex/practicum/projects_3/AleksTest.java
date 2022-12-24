package ru.yandex.practicum.projects_3;

import org.junit.Test;
import ru.yandex.practicum.projects_3.animals.Aleks;
import ru.yandex.practicum.projects_3.animals.Feline;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AleksTest {

    @Test
    public void getKittensReturnsValidKittens() throws Exception {
        Feline feline = new Feline();
        Aleks aleks = new Aleks(feline);
        int expectedKittens = 0;

        int actualKittens = aleks.getKittens();

        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void getFriendsReturnsValidListFriends() throws Exception {
        Feline feline = new Feline();
        Aleks aleks = new Aleks(feline);
        String[] expectedFriendList = {"Марти", "Глория", "Мелман"};

        String[] actualFriendList = new String[expectedFriendList.length];
        aleks.getFriends().toArray(actualFriendList);

        assertArrayEquals(expectedFriendList, actualFriendList);
    }

    @Test
    public void getPlaceOfLivingReturnsValidPlaceOfLiving() throws Exception {
        Feline feline = new Feline();
        Aleks aleks = new Aleks(feline);
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";

        String actualPlaceOfLiving = aleks.getPlaceOfLiving();

        assertEquals(expectedPlaceOfLiving, actualPlaceOfLiving);
    }
}