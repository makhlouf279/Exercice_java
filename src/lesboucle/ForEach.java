package lesboucle;
/*
 lire les eliment de tableau en utilisant les 2 bouche
 for
 Each

 */
public class ForEach

{
    public static void main(String[] args)
    {

            /*
            ----1---avec boucle for
             */
        /*
        char[]letter={'q','w','w','r'};

        for (int i=0;i< letter.length;i++)
        {
            System.out.println(letter[i]);
        }



*/
        /*
        ----2--avec la boucle Each
         */
        /*char[] letter = {'q', 'w', 'w', 'r'};

        for (char items: letter)
        {
            System.out.println(items);
        }*/




        /*
        ----3--avec la boucle ForEach
         */

        //calcule al somme des element de tableau  number  evec la boucle each
        int sum=0;
        int[] number = {1, 5, 10, 20};

        for (int num: number)
        {
             sum+=num;
            System.out.println(num);
        }
        System.out.println("-----------------" +sum);
    }
}
