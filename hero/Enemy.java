package hero;

public class Enemy {
    String name = "Bear";
    int health = 400;
    int damage = 50;

       void attack (Hero hero) {
           hero.health -= damage;

           System.out.println(name + " атакует " + hero.name + "! Осталось HP: " + hero.health);
       }
       boolean isAlive () { return health > 0;}
    void printStats (){
        System.out.println("Имя: " + name + "| HP " + health + " | Урон: " + damage);
    }
}