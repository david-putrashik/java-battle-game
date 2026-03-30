package hero;

public class Main {
    public static void main(String[]args){
        Hero hero1 =  new Hero(); //Создали метод
        hero1.name = "David";     //Так мы называем имя у одного обьекта
        hero1.health = 100;
        hero1.damage = 15;

        System.out.println(hero1.name + " имеет " + hero1.health + "HP");

        Hero hero2 = new Hero();
        hero2.name = "Bear";
        hero2.health = 400;
        hero2.damage = 50;

        System.out.println(hero2.name + " имеет " + hero2.health + "HP");

        hero1.printStats();
        hero2.printStats();
        hero2.attack(hero1);
           if (!hero1.isAlive()) {
               System.out.println(hero1.name + " погиб!");
               return;
           }
        hero1.printStats();

        Enemy enemy = new Enemy();
        enemy.printStats();
        enemy.attack(hero1);
        if (!hero1.isAlive()) {
            System.out.println(hero1.name + " погиб!");
            return; }
        hero1.printStats();

    }

}
