public class protected_access_modifier extends multiplication
{
    public static void main(String[] args)
    {
        protected_access_modifier obj = new protected_access_modifier();
        System.out.println(obj.multipliers(4,5));
    }
}
//The extends keyword means the Subclass is inheriting from the Superclass.
//
//This is called inheritance, a core concept in Object-Oriented Programming (OOP).
//
//The subclass gets access to all non-private members (fields and methods) of the superclass — including protected ones.

//When methods and data members are declared protected, we can access them within the same package as well as from subclasses.
//
//We can also say that the protected access modifier is somehow similar to the default access modifier,
// It is just that it has one exception, which is its visibility in subclasses.

//Note that classes cannot be declared protected. This access modifier is generally used in a parent-child relationship.

