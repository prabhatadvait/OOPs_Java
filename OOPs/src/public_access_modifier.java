public class public_access_modifier {
    public static void main(String args[]){
        // there is public class car in car.java file
        car obj = new car();
        obj.tireCount  = 4;
        obj.display();
    }
}
// public access method allows access within the packages and also outside the packages.
