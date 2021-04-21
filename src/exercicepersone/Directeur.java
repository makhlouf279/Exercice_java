package exercicepersone;

import java.util.Calendar;

public class Directeur extends Chef
{
    private String societe;
    Directeur(String nom, String prenom, int age, float salaire, String service, String societe) {
        super(nom, prenom,age , salaire, service);
        this.societe=societe;
    }


    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("la societe est " +societe);
    }
}
