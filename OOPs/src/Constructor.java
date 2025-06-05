public class Constructor {
    int a;
    String Name;

    public Constructor(){
        a = 3*3;
        Name = "prabhat";
    }

    public static void main(String[] args){
        Constructor obj = new Constructor();
        System.out.println(obj.a +" "+ obj.Name);
    }
}

//A constructor in Java is a method that you use to initialize newly created objects.