
package string;

public class StringMethod
{
    public static void main(String[] args)
    {
        String s1 = "makhlouf AROUA";
        String s2= "djerbien";
        String[]s3;
            //LES METHODE DE ------STRING------

        System.out.println("String : " +s1);
        System.out.println("the first charecter : " + s1.charAt(0));   //charAt()
        System.out.println("lenght of string : " +s1.length());  //lenght()
        System.out.println("Substring : " +s1.substring(5));//substring()
        System.out.println("is equal : " + s1.equals(s2));//equals()
        System.out.println(" is Empty : " +s1.isEmpty());//isEmpty()
        System.out.println(" concat  " + s1.concat(s2));//concat()
        System.out.println("Uppercase : " +s2.toUpperCase()); //toUpperCase()
        System.out.println("Lowercase : " +s1.toLowerCase()); //toLowerCase()

        // split method
        s3=s1.split(" ");

        for(String string :s3)
        {
            System.out.print(string);
        }

        // replace() method

        System.out.println("\nReplace a, A :" + s1.replace('a','A') );

    }


}
