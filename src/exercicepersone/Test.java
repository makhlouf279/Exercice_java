package exercicepersone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {

        Personne[]per=new Personne[8];

        per[0]=new Employe("ali","aroua",35,3000);
        per[1]=new Employe("khaled","aroua",43 ,3000);
        per[2]=new Employe("othman","aroua",34,3000);
        per[3]=new Employe("sassi","aroua",55,3000);
        per[4]=new Employe("mosbah","aroua",62,3000);
        per[5]=new Chef("sami","aroua",45,5000,"chef menage");
        per[6]=new Chef("chokri","aroua",26 ,5000,"chef operateur");
        per[7]=new Directeur("chokri","aroua",36,5000,"directeur","java");

/*
        for(int i=0;i< per.length;i++)
        {
            per[i].afficher();
        }
*/

        //ou bien boch each for
        for(Personne a: per)
        {
            a.afficher();
        }


    }

}
