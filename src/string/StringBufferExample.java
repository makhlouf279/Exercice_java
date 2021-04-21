package string;
/*
String buffer pour manipuler des chaine de carectere modifiable
 */
public class StringBufferExample
{
    public static void main(String[] args)
    {
        StringBuffer buffer =new StringBuffer("welcome to ");
        buffer.append(" canada ");// mutable buffer object
        // buffer object point out welcome to canada
        System.out.println(buffer);
        System.out.println(buffer.length());
        System.out.println(buffer.insert(buffer.length(), "makhlouf"));
        System.out.println(buffer.reverse());
        System.out.println(buffer.reverse());
        System.out.println(buffer.delete(0,11));


    }
}
/*
       [STRING BUILDER IS FASTER THAN STRING BUFFER BECAUSE THE STRING-]
       [BUFFER IS SYNCHRONIZED .....BUT EXACTLY THE SAME THEY HAVE THE SAME METHOD ]
 */