package exercicepersone;

import java.util.Calendar;

public class Employe extends Personne{
    private float salaire;
    Employe(String nom, String prenom, int age, float salaire) {
        super(nom, prenom, age);
        this.salaire=salaire;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("mon salaire est "+salaire);
    }
}
