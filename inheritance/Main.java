package inheritance;

public class Main {
    public static void main(String[] args) {
        HeroA hero = new HeroA("Naya", 5, 30);
        EnemyA enemy = new EnemyA("Shark", 10, 160);
        Boss ei = new Boss("Ei",20,200,20);
        System.out.println("Имя - " + hero.getName() + " | Урон - " + hero.getDamage() + " | HP - " + hero.getHealth());
        System.out.println("Имя - " + enemy.getName() + " | Урон - " + enemy.getDamage() + " | HP - " +
                enemy.getHealth());

        System.out.println("HP до: " + enemy.getHealth());
        enemy.takeDamage(50);
        System.out.println("HP после: " + enemy.getHealth());

        hero.setHealth(30);
        enemy.setHealth(160);
        hero.hit(enemy);

        System.out.println("Начнем состезание между " + hero.getName() + " и " + enemy.getName() + " !");
        int i = 1;
        while (hero.getHealth() > 0 && enemy.getHealth() > 0) {
            System.out.println("____________________________________");
            System.out.println("Раунд: " + i);
            hero.hit(enemy);
            if (enemy.getHealth() > 0) {
                hero.hit(enemy);
                if (enemy.getHealth() > 0) {
                    enemy.hit(hero);
                } else {
                    System.out.println(enemy.getName() + " погиб!");
                }
            } else {
                System.out.println(enemy.getName() + " погиб!");
            }
            if(hero.getHealth() <= 0) {
                System.out.println(hero.getName() + " погиб!");
            }
            i++;
        }
        hero.setHealth(100);
        System.out.println(hero.getName() + " HP: " + hero.getHealth());
        ei.specialAttack(hero);
        System.out.println(hero.getName() + " HP после спец отаки босса: " + hero.getHealth());

        //пишем новый бой:

        System.out.println("===================================================");
        System.out.println("Начнем новый бой! \nМежду " + hero.getName() + " и " + ei.getName() + "!");
        hero.setHealth(100);
        hero.setDamage(10);
        System.out.println(hero.getName() + " - HP: " + hero.getHealth() + " | Урон: " + hero.getDamage());
        System.out.println(ei.getName() + " - HP: " + ei.getHealth() + " | Урон: " + ei.getDamage());

        int a = 1;
        while(hero.getHealth() > 0 && ei.getHealth() > 0) {
            System.out.println("_________________________________");
            System.out.println("Раунд - " + a);
            hero.hit(ei);
            if(ei.getHealth() > 0) {
                hero.hit(ei);
                if(ei.getHealth() > 0 ) {//дописать строгое "и" в цикл, и сделать спец отаку раз в 2 удара по раудам
                    if(a % 3 == 0) {
                        ei.specialAttack(hero);
                    } else {
                    ei.hit(hero);
                    }
                    if (hero.getHealth() <= 0) {
                        System.out.println(hero.getName() + " - погиб!");
                        System.out.println("Победил - " + ei.getName() + "!");
                    }
                    if (ei.getHealth() <= 0) {
                        System.out.println(ei.getName() + " - погиб!");
                        System.out.println("Победил - " + hero.getName() + "!");
                    }
                    a++;


                }
            }
        }
        //__________________________________-проверка Warrior-_______________________________________________//
        Warrior pol = new Warrior("Палладин",20,150, 15);
        ei.setHealth(200);
        pol.printStats();
        ei.printStats();
        ei.hit(pol);
        ei.hit(pol);
        //__________________________________-проверка LightningMag-__________________________________________//
        LightningMage rohr = new LightningMage("Роа",10,100,50);
        rohr.printStats();
        ei.setHealth(200);
        ei.printStats();
        rohr.hit(ei);
        rohr.specMagAtk(ei);
    }
}