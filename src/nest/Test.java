package nest;



public class Test {

static int staicVaribal ;
 int instanceVaribal;  // instatance varibale


public void incr(){

    staicVaribal++;
    instanceVaribal++;
}

public  static void nonStatic( int a,  int b){

     int sum= a+b;  // local varible
    System.out.println(" la somme est " +sum);


    }
public void afficher()
{
    //instanceVaribal=12;



    System.out.println("variable static est " +staicVaribal);
    System.out.println("variable instatnce est " +instanceVaribal);
}


    public static void main(String[] args) {
    // int k=0;
    Test test=new Test();
    Test test1=new Test();
    Test test2=new Test();
    test.incr();
    test1.incr();
    test2.incr();
    test.afficher();
        System.out.println("-------------------" );

        nonStatic(5,6);




    }

}


