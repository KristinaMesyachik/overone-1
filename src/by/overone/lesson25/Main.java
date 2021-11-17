package by.overone.lesson25;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String heroName = scanner.nextLine();
        MarvelHero marvelHero;
        try {
            marvelHero = MarvelHero.valueOf(heroName.toUpperCase(Locale.ROOT));
            System.out.println(marvelHero.getPower());
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid hero, try again ...");
        }
    }
}

enum MarvelHero {
    IRON_MAN("Ydar lazerom"),
    SPIDER_MAN("Ydar paytinoi"),
    CAPITAN_AMERICA("Ydar schitom"),
    HANAS("Perchatka");

    private String power;

    MarvelHero(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }

}
