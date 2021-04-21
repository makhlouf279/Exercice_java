package com.makhlouf;

public class TstPnt
{


        public	static	void	main	(String	args[])
        {

            Pointt a	=	new	Pointt(3,	5)	;
            System.out.println("je suis un point de cordonne "+ a.ordonnee()+ " et d`abscisse "+ a.abscisse());
            a.deplace(2,	0)	;
            System.out.println("je suis un point de cordonne " + a.ordonnee()+ " et d`abscisse "+ a.abscisse());
            Pointt	b	=	new	Pointt(6,	8)	;
            System.out.println("je suis un point de cordonne " + b.ordonnee()+ " et d`abscisse "+ b.abscisse());
        }
}
