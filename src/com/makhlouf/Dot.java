/*.	une	classe	permettant	de	manipuler	un	point	d’un	axe,	repéré	par	une	abscisse
        (de	type	int).	On	devra	pouvoir	effectuer	des	changements	d’origine,	en	conservant
        en	 permanence	 l’abscisse	 d’une	 origine	 courante	 (initialement	 0).	 On	 prévoira
        simplement	les	méthodes	suivantes	:
        •	 constructeur,	 recevant	 en	 argument	 l’abscisse	 "absolue"	 du	 point	 (c’est-à-dire
        repérée	par	rapport	au	point	d’origine	0	et	non	par	rapport	à	l’origine	courante),
        •	affiche	 qui	imprime	 à	la	 fois	l’abscisse	 de	l’origine	 courante	 et	l’abscisse	 du
        point	par	rapport	à	cette	origine,
        •	setOrigine	qui	permet	de	définir	une	nouvelle	abscisse	pour	l’origine	(exprimée
        de	façon	absolue	et	non	par	rapport	à	l’origine	courante),
        •	getOrigine	qui	permet	de	connaître	l’abscisse	de	l’origine	courante.
        Ecrire	un	petit	programme	de	test	fournissant	les	résultats	suivants	:

                Point	a	-	abscisse	=	3
	            relative	a	une	origine	d'abscisse	0
                Point	b	-	abscisse	=	12
	            relative	a	une	origine	d'abscisse	0
                On	place	l'origine	en	3
                Point	a	-	abscisse	=	0
               	relative	a	une	origine	d'abscisse	3
                Point	b	-	abscisse	=	9
                relative	a	une	origine	d'abscisse	3

*/
package com.makhlouf;
class Dot

{
    /*
    constructeur,	 recevant	 en	 argument	 l’abscisse	 "absolue"	 du	 point	 (c’est-à-dire
       repérée	par	rapport	au	point	d’origine	0	et	non	par	rapport	à	l’origine	courante),
     */
    private	 static	 int origine;	 //	 abscisse	 absolue	 de	 l'origine    courante
    private	int	x;	//	abscisse	absolue	du	point

    public	Dot	(int	xx )
    {	x	=	xx	;
    }


    /*
    affiche	 qui	imprime	 à	la	 fois	l’abscisse	 de	l’origine	 courante	 et	l’abscisse	 du
        point	par	rapport	à	cette	origine,
     */

    public	void	affiche	()

    {	System.out.println	("abscisse	=	"	+	(x-origine))	;
        System.out.println	 ("	 relative	 a	 une	 origine	 d'abscisse	 "	 +
                origine)	;
    }

    /*
    setOrigine	qui	permet	de	définir	une	nouvelle	abscisse	pour	l’origine	(exprimée
        de	façon	absolue	et	non	par	rapport	à	l’origine	courante),
     */

    public	static	void	setOrigine	(int	org)
    {	origine	=	org	;
    }


    /*
    getOrigine	qui	permet	de	connaître	l’abscisse	de	l’origine	courante.
        Ecrire	un	petit	programme	de	test	fournissant	les	résultats	suivants
     */
    public	static	int	getOrigine()
    {	return	origine	;
    }

    }

// page 66