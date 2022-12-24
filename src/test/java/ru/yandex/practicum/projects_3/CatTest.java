package ru.yandex.practicum.projects_3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ru.yandex.practicum.projects_3.animals.Cat;
import ru.yandex.practicum.projects_3.animals.Feline;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getFoodReturnsValidFood() {
        Cat cat = new Cat(feline);
        String[] expectedFood = {"Животные", "Птицы", "Рыба"};

        try {
            Mockito.when(feline.eatMeat()).thenReturn(new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба")));
            String[] actualFood = new String[feline.eatMeat().size()];
            cat.getFood().toArray(actualFood);

            Assert.assertArrayEquals(expectedFood, actualFood);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getSoundReturnsValidSound() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";

        String actualSound = cat.getSound();

        assertEquals(expectedSound, actualSound);

    }

}