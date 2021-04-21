/*
Objectif:
Mettre en place le concept du polymorphisme.
Énonce:
Soit les classes suivantes:

une classe Personne qui comporte trois champs privés, nom, prénom et date de naissance.
Cette classe comporte un constructeur pour permettre d'initialiser
les données. Elle comporte également une méthode polymorphe Afficher
pour afficher les données de chaque personne.

une classe Employé qui dérive de la classe Personne, avec en plus
 un champ Salaire accompagné de sa propriété, un constructeur et la redéfinition de la méthode Afficher.

une classe Chef qui dérive de la classe Employé, avec en plus
 un champ Service accompagné de sa propriété, un constructeur et la redéfinition de la méthode Afficher.

une classe Directeur qui dérive de la classe Chef, avec en plus
 un champ Société accompagné de sa propriété, un constructeur et la redéfinition de la méthode Afficher.

Travail à faire:

Ecrire les classe Personne, Employé, Chef et Directeur.
créez un programme de test qui comporte tableau
de huit personnes avec cinq employés, deux chefs
et un directeur (8 références de la classe Personne
dans lesquelles ranger 5 instances de la classe Employé, 2 de la classe Chef et 1 de la classe Directeur).
Affichez l'ensemble des éléments du tableau à l'aide de for.
Affichez l'ensemble des éléments du tableau à l'aide de foreach.
//Source : www.exelib.net
 */


package exercicepersone;

import java.util.Calendar;

public class Personne {

    private String nom;
    private String prenom;
    private int  age;
/*
package exercicepersone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateTime {
    public  void run() {
        Calendar dateDeNaissance = Calendar.getInstance();
      //  dateDeNaissance.set(1980, 05, 21);
        SimpleDateFormat formater =new SimpleDateFormat(" ", Locale.CANADA);
        formater.applyPattern("yyyy/mm/dd");
        System.out.println(formater.format(dateDeNaissance.getTime()));

    }

}

java.util.Calendar naissance = Calendar.getInstance();

 */


    Personne(String nom,String prenom, int age  ){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void afficher(){

        System.out.println("je m`apelle " +nom+" "+prenom+" j`ai "+age);

    }

}
