/*
*Réaliser une	 classe	 Point	 permettant	 de	 représenter	 un	 point	 sur	 un	 axe.	 Chaque
point	sera	caractérisé	par	un	nom	(de	type	char)	et	une	abscisse	 (de	type	double).
On	prévoira	:
•	un	constructeur	recevant	en	arguments	le	nom	et	l’abscisse	d’un	point,
•	 une	 méthode	 affiche	 imprimant	 (en	 fenêtre	 console)	 le	 nom	 du	 point	 et	 son
abscisse,
•	 une	 méthode	 translate	 effectuant	 une	 translation	 définie	 par	 la	 valeur	 de	 son
argument.
Écrire	un	petit	programme	utilisant	cette	classe	pour	créer	un	point,	en	afficher	les
caractéristiques,	le	déplacer	et	en	afficher	à	nouveau	les	caractéristiques.

* */

package com.makhlouf;

public class Point
{

    public static void main(String[]args)
    {
        Pointest p1=new Pointest('x',2.0);// constructeur de point 1
        p1.affiche();
        p1.translate(9);
        Pointest p2=new Pointest('y',3);// constructeur de point 1
        p2.affiche();
        p2.translate(4);
    }
}
