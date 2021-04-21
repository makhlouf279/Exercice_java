package nest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionProg {

    public static void main(String[] args) throws  FileNotFoundException,IOException {
        InputStream is = null;
        //---------------------------------------------
        //try {
             is = new FileInputStream("C:\\Users\\makhl\\Desktop\\mak.txt");
        //}catch(FileNotFoundException e){
            //System.out.println("le programme continu....");
       // }
        //----------------------------------------------------------------
        int c;
        //---------------------------------------------
        //try {
            while ((c = is.read())!=-1) {
                System.out.println((char) c);
            }
            /*
        }catch(IOException e){
            System.out.println("..............");
        }*/
        //----------------------------------------------------------------------
        System.out.println();
        System.out.println("suite de prog................");


        

       /*
        try {
            String[] tab = new String[200000000000000000];
        } catch (OutOfMemoryError e) {
            System.out.println("memoire inssufisante.....");
        }
        finally{
            System.out.println("le prog continue.............");
        }
        System.out.println("on peut continuer.............");

        */
    }
}
