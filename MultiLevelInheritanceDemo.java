
class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void guard() {
        System.out.println("Dog guards the house");
    }
}


class Puppy extends Dog {
    @Override
    void sound() {
        System.out.println("Puppy yelps");
    }

    void play() {
        System.out.println("Puppy plays with ball");
    }
}


public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound();   
        p.guard();  
        p.play();    
    }
}
