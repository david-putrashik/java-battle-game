package interfaces;

import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру!");
        System.out.println("Выберите класс своего персонажа: ");
        System.out.println("|1 - Warrior |2 - Mage |3 - Vampir ");
        int chois = scanner.nextInt();
        scanner.nextLine(); //очищаем буфер!

        Character2 player;

        if (chois == 1) {
            player = new Warrior("---", 10, 150, 150);
        } else if (chois == 2){
            player = new Mage("---", 25, 75,75);
        } else {
            player = new Vampire("---",18,100,100);
        }
        System.out.println("Назовите своего персонажа: ");
        String name = scanner.nextLine();
        player.setName(name);
        System.out.println("Ваш персонаж и его характеристики: ");
        player.printStats();

        Character2 enemy;
        double rand = Math.random();
        if (rand <= 0.4) {
            enemy = new Enemy("Гоблин", 10, 120, 120);
        } else if (rand > 0.4 && rand < 0.9) {
            enemy = new Enemy("Волк", 15, 100,100);
        } else {
            enemy = new Enemy("Медведь", 15, 160, 160);
        }
        System.out.println("Ваш враг - ");
        enemy.printStats();
        System.out.println("Начнем бой!");

        int r = 1;

        while (player.getHealth() > 1 && enemy.getHealth() > 1) {
            System.out.println("________________________________________");
            System.out.println("Раунд - " + r);

            if (player instanceof Mage) { //instanceof - проверем маг ли это?
                ((Mage)player).specialAttack(enemy); // даем Character2 - доступ к классу Mage
                if (enemy.getHealth() > 1) {
                    enemy.hit(player);
                }
            } else if (player instanceof Vampire) {
                ((Vampire)player).vampirism(enemy);
                if (enemy.getHealth() > 1) {
                    enemy.hit(player);
                }

            } else {
                    player.hit(enemy);
                    if (enemy.getHealth() > 1) {
                        boolean blocked = ((Warrior)player).block();
                        if (blocked) {
                            System.out.println("|| " + player.getName() +
                                    " блокировал удар " + enemy.getName() + "! ||");
                        } else {
                            enemy.hit(player);
                        }
                    }
                }

            r++;
        }

        if (player.getHealth() <= 1) {
            System.out.println(player.getName() + " пороиграл!");
            System.out.println("Победитель - " + enemy.getName() + "!");
            if (enemy.getHealth() <= 1) {
                System.out.println(enemy.getName() + " пороиграл!");
                System.out.println("Победитель - " + player.getName() + "!");
            }
        }
    }
}
