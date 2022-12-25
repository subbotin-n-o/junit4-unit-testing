package ru.yandex.practicum.projects_3;

import org.junit.Test;
import ru.yandex.practicum.projects_3.animals.Animal;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void getFoodHerbivoreReturnsValidFood() throws Exception {
        Animal animal = new Animal();
        String[] expectedFood = {"Трава", "Различные растения"};

        String[] actualFood = new String[expectedFood.length];
        animal.getFood("Травоядное").toArray(actualFood);

        assertArrayEquals(expectedFood, actualFood);

    }

    @Test
    public void getFoodPredatorReturnsValidFood() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");

        List<String> actualFoodList = animal.getFood("Хищник");

        assertEquals(expectedFoodList, actualFoodList);

    }

    @Test(expected = Exception.class)
    public void getFoodNullArgReturnsException() throws Exception {
        new Animal().getFood(null);

    }

    @Test
    public void getFamilyReturnsValidFamily() {
        Animal animal = new Animal();
        String expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        String actualFamily = animal.getFamily();

        assertEquals(expectedFamily, actualFamily);

    }

}