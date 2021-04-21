package lesboucle;

public class WhileLoop
{
    public static void main(String[] args)
    {
//----------------------------------------

        int i=0;
        while(i<5)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("--------------------------");
//--------------------------------------------------------------
        // multiplication --
int k=1, fact=1;
while(k<5)
{
    fact*=k;
    System.out.println(fact);
    k++;
}
        System.out.println("..........................");

int x=0;
int sum=1;
while(x<5){
    sum+=x;
    System.out.println(sum);
    x++;
}



    }
}
