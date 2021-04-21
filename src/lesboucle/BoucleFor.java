package lesboucle;

public class BoucleFor
{
    public static void main(String[] args)
    {

        int sum=0;
        for(int i=0; i<5;i++)
        {
            sum+=i;
            System.out.println(i);
        }
        System.out.println("---------------------" +sum);


    }
}
