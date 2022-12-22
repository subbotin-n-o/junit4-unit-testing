package ru.yandex.practicum.projects_3;

import org.junit.Test;
import ru.yandex.practicum.projects_3.animals.Feline;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatReturnsValidFood() {
        Feline feline = new Feline();
        String[] expectedFood = {"Животные", "Птицы", "Рыба"};

        try {
            String[] actualFood = new String[expectedFood.length];
            feline.eatMeat().toArray(actualFood);

            assertArrayEquals(expectedFood, actualFood);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getFamilyReturnsValidFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";

        String actualFamily = feline.getFamily();

        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensNoArgumentReturnsOne() {
        Feline feline = new Feline();
        int expectedKittens = 1;

        int actualKittens = feline.getKittens();

        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void getKittensWithAnArgumentReturnsArgument() {
        Feline feline = new Feline();
        int expectedKittens = 10;

        int actualKittens = feline.getKittens(expectedKittens);

        assertEquals(expectedKittens, actualKittens);
    }
}