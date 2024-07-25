package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);
       Player player = new Player("John", 100, Weapon.SWORD);
        player.loseHealth(20);
        player.loseHealth(20);
        player.healthRemaining();//60
        player.loseHealth(80);
        player.healthRemaining();//0
        System.out.println("distance()= " + point.distance());
    }
}