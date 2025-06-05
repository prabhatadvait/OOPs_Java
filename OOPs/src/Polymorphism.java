class Animal2 {
    public void animalsound(){
        System.out.println("Animal make sound");
    }
}

class Dogy extends Animal2{
    public void animalsound(){
        System.out.println("A dog braks: bho-bho");
    }
}

class Caty extends Animal2{
    public void animalsound(){
        System.out.println("A cat says: Meow-meow");
    }
}

public class Polymorphism {
    public static void main(String[] args)
    {
        Animal2 obj1 = new Animal2();
        Dogy obj2 = new Dogy();
        Caty obj3 = new Caty();

        obj1.animalsound();
        obj2.animalsound();
        obj3.animalsound();
    }
}
