package ru.yandex.practicum.projects_3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ru.yandex.practicum.projects_3.animals.Cat;
import ru.yandex.practicum.projects_3.animals.Feline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getFoodReturnsValidFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");

        Mockito.when(feline.eatMeat()).thenReturn(new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба")));
        List<String> actualFoodList = cat.getFood();

        assertEquals(expectedFoodList, actualFoodList);

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