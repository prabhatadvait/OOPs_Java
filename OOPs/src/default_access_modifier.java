class SampleClass
{
    void output()
    {
        System.out.println("This the example of Default Access Modifier.");
    }
}
class default_access_modifier
{
    public static void main(String args[])
    {
        SampleClass obj = new SampleClass();
        obj.output();
    }
}

// This is called as package-private modifier , classes are accessible within package only not outside like public