package interfaces;

public class Warrior extends Character2 implements Attack, Healable{

    public Warrior (String name, int damage, int health, int maxHP) {super(name, damage, health, maxHP);}

    public void attack() {
        System.out.println("Атакует!");
    }
    public void heal() {
        System.out.println("лечится!");
    }
    public boolean block () {
        if (Math.random() < 0.2) {
            return true;
        } else {
            return false;
        }
    }
}
/* ===========ОТВЕТ КЛОДА==============
Про return — объясняю просто:
Метод это как вопрос. return — это ответ.
java// Вопрос: сработал блок?
public boolean block() {
    return true;  // Ответ: да
}
Тип перед именем метода говорит что за ответ ожидается:

void — ответа нет, просто делай
boolean — ответ да/нет
int — ответ число
String — ответ текст


В Main ты ловишь этот ответ так:
javaboolean blocked = warrior.block(); // поймали ответ
if (blocked) {
    System.out.println("Блок!");
}
 */
