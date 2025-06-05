class Animal {
    String name;
    public void Does(){
        System.out.println("Eat and sleep");
    }
}

class Dog extends Animal{

    public void display(){
        System.out.println("My name is: "+name);
    }
}

public class Inheritance {
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.name = "Kutta ji, the kutta";
        obj.display();
    }
}
