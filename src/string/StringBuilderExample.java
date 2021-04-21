package string;

public class StringBuilderExample
{
    public static void main(String[] args)
    {
        StringBuilder builder =new StringBuilder("welcome to ");
        builder.append(" canada ");// mutable builder object
        // builder object point out welcome to canada
        System.out.println(builder);
        System.out.println(builder.length());
        System.out.println(builder.insert(builder.length(), "makhlouf"));
        System.out.println(builder.reverse());
        System.out.println(builder.reverse());
        System.out.println(builder.delete(0,11));


    }
}

/*                         [STRING]             [STRING BUFFER]                    [STRING BUILDER]

 [STORAGE AREA]               STRING POOL              HEAP                             HEAP
 [MODIFIABLE]                NO IMMUTABLE            MUTABLE                           MUTABLE
 [PERFORMANCE]                   FAST                 SLOW                               FAST

****SINGLE THREAD BETTER YO USE STRING BUFFER****
 */
