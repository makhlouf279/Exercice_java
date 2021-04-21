package com.makhlouf;

 class Pointest
{
    char nom;
    double abscisse;

    Pointest(char nom, double abscisse)// constructeur de point avec les parametres
    {
        this.nom=nom;
        this.abscisse=abscisse;
    }
   public void affiche()
    {

        System.out.println("le point  " +this.nom + " d`abscisse "+ this.abscisse);
    }
    public void translate(double dx)
    {
        abscisse+=dx;

        System.out.println("le point  " + this.nom + " d`abscisse " + abscisse);

    }
}
