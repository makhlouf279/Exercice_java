package string;

public class StringExample
{
    public static void main(String[] args)
    {

        String s = "Makhlouf";
        String s1 = "Makhlouf";
        String ob=new String("Makhlouf");
        String ob1=new String("Makhlouf");

/*
        System.out.println(s);
        System.out.println(s1);
        System.out.println(ob);
        System.out.println(ob1);
*/
        System.out.println(s==s1);
        System.out.println(s==ob);
        System.out.println(s.equals(s1));
        System.out.println(s.equals(ob));
        System.out.println(ob==ob1);
        System.out.println(ob.equals(ob1));

    }
}
