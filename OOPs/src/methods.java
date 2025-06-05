public class methods {
    public int divideNumber(int x, int y)
    {
        int division = x/y;
        return division;
    }

    public static void main(String[] args)
    {
        int firstn = 8;
        int secondn = 4;
        methods obj = new methods();

        int result = obj.divideNumber(firstn,secondn);
        System.out.println("The result: "+result);
    }
}
