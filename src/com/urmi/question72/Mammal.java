package com.urmi.question72;

public class Mammal {
    String title;
    int value;

    public Mammal() {
        title += "World";
    }

    public Mammal(int value) {
        this.value = value;
        title = "Hello";
        //Hello(); // cause of compilation error
    }

    public static void main(String[] args) {
        Mammal c = new Mammal(5);
        System.out.println(c.title);
    }
}


class Raccoon extends Mammal {
    Mammal m = new Mammal();
}

class BabyRaccoon extends Mammal {

}

