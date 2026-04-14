package practick;

import java.util.Scanner;
public class shopWeapon {
    Weapon ton;
    Weapon mess;
    Weapon knowa;
    Weapon zak;
    Weapon nom;
    Weapon arm;

    public shopWeapon () {
        ton = new Weapon("Тон",22);
        mess = new Weapon("Мэсс",30);
        knowa = new Weapon("Нова",40);
        zak = new Weapon("Зак",30);
        nom = new Weapon("Ном",99);
        arm = new Weapon("Кулаки", 0);

    }

    public void showWeapon() {
        System.out.println("Добро пожаловать в наш магазин! \nНаши товары: ");
        System.out.println( "1 Имя - " + ton.getNameW() + "  |  Урон: " + ton.getDamageW());
        System.out.println( "2 Имя - " + mess.getNameW() + " |  Урон: " + mess.getDamageW());
        System.out.println( "3 Имя - " + knowa.getNameW() + " |  Урон: " + knowa.getDamageW());
        System.out.println( "4 Имя - " + zak.getNameW() + " |  Урон: " + zak.getDamageW());
        System.out.println( "5 Имя - " + nom.getNameW() + " |  Урон: " + nom.getDamageW());

    }
    public void bayWeapon(heroPractick hero) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что хотите взять для " + hero.getName() + "?");
        System.out.println("1. 2. 3. 4. 5. ?");

        int a = 0;
        String yaa = "";
        while (!yaa.equalsIgnoreCase("нет")) {
            System.out.println("Ведите номер оружия: ");
            a = scanner.nextInt();
            scanner.nextLine();
            System.out.println("1. 2. 3. 4. 5. ?");
            if (a == 1) {
                hero.setWeapon(ton);
                System.out.println("Теперь оружие " + hero.getName() + " - " + ton.getNameW());
            } else if (a == 2) {
                hero.setWeapon(mess);
                System.out.println("Теперь оружие " + hero.getName() + " - " + mess.getNameW());
            } else if (a == 3) {
                hero.setWeapon(knowa);
                System.out.println("Теперь оружие " + hero.getName() + " - " + knowa.getNameW());
            } else if (a == 4) {
                hero.setWeapon(zak);
                System.out.println("Теперь оружие " + hero.getName() + " - " + zak.getNameW());
            } else if (a == 5) {
                hero.setWeapon(nom);
                System.out.println("Теперь оружие " + hero.getName() + " - " + nom.getNameW());
            } else {
                hero.setWeapon(arm);
                System.out.println("Оружия под данным номером не нашлось( ");
            }
            System.out.println("Хотите подъискать другое? (нет - чтобы выйти.");
            yaa = scanner.nextLine();

        }
    }
}
