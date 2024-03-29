package ru.yandex.practicum.projects_3;

import org.junit.Test;
import ru.yandex.practicum.projects_3.animals.Feline;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatReturnsValidFood() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");

        List<String> actualFoodList = feline.eatMeat();

        assertEquals(expectedFoodList, actualFoodList);

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