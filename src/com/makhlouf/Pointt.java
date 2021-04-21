/*
Modifier	 la	 définition	 de	 la	 classe	Pointt	 en	 supprimant	 la	 méthode	 affiche	 et	 en
introduisant	 deux	 méthodes	 d’accès	 nommées	 abscisse	 et	 ordonnee	 fournissant
respectivement	 l’abscisse	 et	 l’ordonnée	 d’un	 point.	 Adapter	 la	 méthode	 main	 en
conséquence.

*/
package com.makhlouf;

 class Pointt
{
    public	Pointt	(int	abs,	int	ord)// constructeur
    {	x	=	abs	;	y	=	ord	;
    }
    public	void	deplace	(int	dx,	int	dy)
    {	x	+=	dx	;
        y	+=	dy	;
        System.out.println("ma nouvelle position est " +"("+x+","+y+")");
    }
   // public	void	affiche	()

    public double ordonnee()
    {	 return x;

    }
    public double abscisse()
    {	 return y;

    }
    private	double	x	;			//	abscisse
    private	double	y	;			//	ordonnee
}



