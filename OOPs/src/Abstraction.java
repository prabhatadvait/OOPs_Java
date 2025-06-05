//Abstract class
abstract class Animal1{
    //abstract method
    abstract void animalSound();

    //Regular method
    public void sleep(){
        System.out.println("Zzzz");
    }
}
//If you are inheriting abstract class or there is abstract method,
// then you have to declare or intialize the method used in the abstract class in the inherited class
class Cow extends Animal1{
    public void animalSound(){
        System.out.println("wow!");
    }


}

public class Abstraction {
    public  static void main(String[] args){
        Cow obj = new Cow();
        obj.animalSound();
        obj.sleep();
    }
}
