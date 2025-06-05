class SampleClass2 // this class name should not be already present in the any java file
{
    private String activity;
    // getter method
    public String getActivity()
    {
        return this.activity;
    }
    // Setter method
    public void setActivity(String activity)
    {
        this.activity = activity;
    }
}

public class private_access_modifier {
    public static  void main(String args[])
    {
        SampleClass2 obj = new SampleClass2();
//        obj.activity = "Hey, this is Prabhat trying to learn"; -> This will never be accessible because of the public class
        // the best way to access these private variables is to use the getter and setter methods.
        String kam = "Prabhat ko pranam";
        obj.setActivity(kam);
        System.out.println(obj.getActivity());
    }
}
// private access modifier block all the class to access , only the method of private can access.
