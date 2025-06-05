public class encapsulation {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    // Better if you declare this whole thing in encapsulation.java file

    public static void main(String[] args){
        encapsulation obj = new encapsulation();
        obj.setName("prabhat");
        String name = obj.getName();
        System.out.println(name);
    }
}
