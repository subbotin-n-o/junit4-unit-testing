package ru.yandex.practicum.projects_3;

import org.junit.Assert;
import org.junit.Test;
import ru.yandex.practicum.projects_3.animals.Cat;
import ru.yandex.practicum.projects_3.animals.Feline;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void getSoundReturnsValidSound() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";

        String actualSound = cat.getSound();

        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getFoodReturnsValidFood() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String[] expectedSound = {"Животные", "Птицы", "Рыба"};

        try {
            String[] actualSound = new String[expectedSound.length];
            cat.getFood().toArray(actualSound);

            Assert.assertArrayEquals(expectedSound, actualSound);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}