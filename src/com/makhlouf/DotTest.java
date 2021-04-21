package com.makhlouf;

public class DotTest
{
    public static void main(String[] args)
    {
        Dot	 a	= new Dot	 (3)	 ;
        System.out.print	 ("Point	 a	 -	 ")	 ;
        a.affiche()	;
        Dot	 b	 =	 new	 Dot	 (12)	 ;
        System.out.print	 ("Point	 b	 -	 ")	 ;
        b.affiche()	;
        Dot.setOrigine(3)	;
        System.out.println	 ("On	 place	 l'origine	 en	 "	 + Dot.getOrigine())	;
        System.out.print	("Point	a	-	")	;
        a.affiche()	;
        System.out.print	("Point	b	-	")	;
        b.affiche()	;

    }

}
