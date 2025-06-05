//INterfaces
interface Language{
    void getName(String name);
}

//class implements interface
class ProgrammingLang implements Language{
    public void getName(String name){
        System.out.println("My fav language Is: " + name);
    }
}

public class Interfaces {
    public static void main(String[] args){
        ProgrammingLang obj = new ProgrammingLang();
        obj.getName("C++");
    }
}
