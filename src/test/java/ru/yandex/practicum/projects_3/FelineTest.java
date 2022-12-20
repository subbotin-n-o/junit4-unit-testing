package ru.yandex.practicum.projects_3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.practicum.projects_3.animals.Animal;
import ru.yandex.practicum.projects_3.animals.Feline;
import java.util.List;

import static org.junit.Assert.assertEquals;

//@RunWith(Parameterized.class)
public class FelineTest {

//    private final Predator predator;
//    private final Herbivore herbivore;
//    private final String expected;

//    public FelineTest(Feline feline, String expected) {
//        this.predator = feline;
//        this.herbivore = null;
//        this.expected = expected;
//    }

    @Test
    public void eatMeatPredatorArgumentReturnText() {
        Feline feline = new Feline();
        try {
            String expected = "Животные, Птицы, Рыба";
            String actual = String.join(", ", feline.eatMeat());

            assertEquals(expected, actual);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eatMeatHerbivoreArgumentReturnText() {
        Herbivore herbivore = new Herbivore();
        try {
            String expected = "Трава, Различные растения";
            String actual = String.join(", ", herbivore.eatMeat("Травоядное"));

            assertEquals(expected, actual);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eatMeatNoArgumentShowsError() {
        Herbivore herbivore = new Herbivore();
        try {
            String expected = "Трава, Различные растения";
            String actual = String.join(", ", herbivore.eatMeat());

            assertEquals(expected, actual);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Parameterized.Parameters
//    public static Object[][] getSumData() {
//        return new Object[][] {
//                {},
//        };
//    }


    @Test
    public void getFamilyNoArgumentReturnText() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();

        assertEquals(expected, actual);
    }

    @Test
    public void getKittensNoArgumentShowsOne() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();

        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithAnArgumentShowsArgument() {
        Feline feline = new Feline();
        int expected = 10;
        int actual = feline.getKittens(expected);

        assertEquals(expected, actual);
    }
}

class Herbivore extends Animal {
    public List<String> eatMeat(String animal) throws Exception {
        return getFood(animal);
    }

    public List<String> eatMeat() throws Exception {
        return getFood(null);
    }
}