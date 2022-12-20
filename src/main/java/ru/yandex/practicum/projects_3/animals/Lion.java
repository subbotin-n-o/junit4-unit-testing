package ru.yandex.practicum.projects_3.animals;

import java.util.List;

public class Lion {

    protected final boolean hasMane;
    protected final Feline predator;

    public Lion(Feline feline, String sex) throws Exception {
        this.predator = feline;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() {
        return predator.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}