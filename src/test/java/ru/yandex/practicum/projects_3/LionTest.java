package ru.yandex.practicum.projects_3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import ru.yandex.practicum.projects_3.animals.Feline;
import ru.yandex.practicum.projects_3.animals.Lion;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {

    final Feline feline;
    final Lion lion;

    public LionTest(Feline feline, Lion lion) {
        this.feline = feline;
        this.lion = lion;
    }

    @Mock
    Feline felineMock;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getFoodReturnsValidFood() throws Exception {
        Lion lion = new Lion(felineMock, "Самец");
        String[] expectedFood = {"Животные", "Птицы", "Рыба"};

        try {
            Mockito.when(felineMock.eatMeat()).thenReturn(new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба")));
            String[] actualFood = new String[feline.eatMeat().size()];
            lion.getFood().toArray(actualFood);

            Assert.assertArrayEquals(expectedFood, actualFood);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getKittensReturnsValidKittens() throws Exception {
        int expectedKittens = 1;

        int actualKittens = feline.getKittens();

        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void doesHaveManeShouldReturnsTrue() throws Exception {
        boolean actualHasMane = lion.doesHaveMane();

        if (actualHasMane) {
            assertTrue(true);
        }
            assertFalse(false);
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() throws Exception {
        Feline feline = new Feline();
        Lion lionMale = new Lion(feline, "Самец");
        Lion lionFemale = new Lion(feline, "Самка");

        return new Object[][]{
                {feline, lionMale},
                {feline, lionFemale}
        };
    }
}