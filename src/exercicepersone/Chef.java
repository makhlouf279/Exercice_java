package exercicepersone;

import java.util.Calendar;

public class Chef extends Employe
{
    private String service;
    Chef(String nom, String prenom, int age, float salaire, String service) {
        super(nom, prenom, age, salaire);
        this.service=service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("mon service est "+service);
    }
}
