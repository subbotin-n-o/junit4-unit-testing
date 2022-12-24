package ru.yandex.practicum.projects_3;

import org.junit.Test;
import ru.yandex.practicum.projects_3.animals.Animal;

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
        String[] expectedFood = {"Животные", "Птицы", "Рыба"};

        String[] actualFood = new String[expectedFood.length];
        animal.getFood("Хищник").toArray(actualFood);

        assertArrayEquals(expectedFood, actualFood);

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