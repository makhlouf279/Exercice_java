package boxing;

public class AutoBoxingUnBoxing
{
    public static void main(String[] args)
    {
        Double db =12.8; //Auto-Boxing of double      [Double is wrapper class]
        double d =db; //Auto-unBoxing of Double
        System.out.println(db + " " +d );

        Integer in =4; //Auto-Boxing of int      [Integer is wrapper class]
        int a =in; //Auto-unBoxing of Integer
        System.out.println(in + " " +a );

        Character k ='S'; //Auto-Boxing of char      [Character is wrapper class]
        char q =k; //Auto-unBoxing of Character
        System.out.println(k + " " +q );
    }


}
