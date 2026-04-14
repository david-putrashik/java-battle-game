package practick;

import java.util.Scanner;          //после пакета ставим импорт
import java.util.Random;           //значит старый вариант

public class MainPractick {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        heroPractick hero02 = new heroPractick("02",12,120, 10);      // создали обьект
        heroPractick hiro = new heroPractick("Хиро",20,90, 20);
        heroPractick meruem = new heroPractick("Меруэм",200,1400,20);
        heroPractick komugi = new heroPractick ("Комуги",3,32,5);

        System.out.println("Здоровье - " + hero02.getHealth());   // выводим значение
        hero02.setHealth(80);                                     // меняем значение снаружи
        System.out.println("Новое здоровье - " + hero02.getHealth());


        System.out.println("Имя: " + hiro.getName() + ". Урон: " + hiro.getDamage() + ". HP: " + hiro.getHealth());
        System.out.println("Имя: " + hero02.getName() + ". Урон: " + hero02.getDamage() + ". HP: " + hero02.getHealth());
        System.out.println("Имя: " + meruem.getName() + ". Урон: " + meruem.getDamage() + ". HP: " + meruem.getHealth());
        System.out.println("Имя: " + komugi.getName() + ". Урон: " + komugi.getDamage() + ". HP: " + komugi.getHealth());

        // 1 Weapon zak = new Weapon("Зак",30);   старый вариант
        // 1 Weapon nom = new Weapon("Ном",99);

        // 1 hiro.setWeapon(zak);        //даем герою оружие
        shopWeapon shop = new shopWeapon(); // класс shopWeapon
        shop.showWeapon();               //показываем магазин
        shopWeapon bay = new shopWeapon();  // класс shopWeapon
        bay.bayWeapon(hiro);             //выбираем оружие для определенного героя

        System.out.println("Урон "+ hiro.getName() + " + oружие = " + hiro.getDamage());
        System.out.println("Урон "+ meruem.getName() + " + oружие = " + meruem.getDamage());
        meruem.setHealth(meruem.getHealth() - hiro.getDamage());    //меняем значееие хп у меруэма

        System.out.println("Хиро ударил Меруэма! У Меруэма осталось: " + meruem.getHealth() + " HP ");

        // 1 hero02.setWeapon(nom);           //даем оружие герою
        shop.showWeapon();                    //вызываем магазин
        bay.bayWeapon(hero02);                //выбираем оружие
        hero02.hit(meruem);              //вызываем метод hit и бьем меруэма

        meruem.setHealth(1400);
        hiro.setHealth(100);
        hiro.setWeapon(null);
        hero02.setWeapon(null);

//______________________________________________пишем арену___________________________________________________________//
        System.out.println("Начнем битву!");
        System.out.println("Соперники: " + hiro.getName() + " и " + meruem.getName() + ".");
        // 1 hiro.setWeapon(nom);
        // 1 System.out.println("Оружие " + hiro.getName() + " - " + nom.getNameW());
        //System.out.println("Оружие " + meruem.getName() + " - кулаки! ");
        shop.showWeapon();
        bay.bayWeapon(hiro);
        bay.bayWeapon(meruem);

        meruem.setDamage(49);
        int i = 1;

        while (hiro.getHealth()  > 0 && meruem.getHealth() > 0){
            System.out.println("___________________________________");
            System.out.println("Раунд - " + i);
            hiro.hit(meruem);
            if (meruem.getHealth() > 0){
            hiro.hit(meruem);
            if(meruem.getHealth() > 0){
            meruem.hit(hiro);
            }
            }
            i++;
        }



    }
}
