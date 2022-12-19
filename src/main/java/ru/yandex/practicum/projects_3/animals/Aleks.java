package ru.yandex.practicum.projects_3.animals;

import java.util.Arrays;
import java.util.List;

public class Aleks extends Lion {

    private final List<String> friendList = Arrays.asList("Марти", "Глория", "Мелман");

    public Aleks(Feline feline) throws Exception {
        super(feline, "Самец");
    }

    @Override
    public int getKittens() {
        return predator.getKittens(0);
    }

    public List<String> getFriends() {
        return friendList;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}