package codingexercice;

public class CompteBancaire {

    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void retirer(double somme){
        if(somme>=solde){
            throw new PasDeSoldeException("il y a pas de solde dans votre compte!!!!---TRY AGAIN");
        }else {

            solde -= somme;
            System.out.println("la nouvelle solde est " + solde);
        }
    }

    public void diposer(double somme){
        solde+=somme;
        System.out.println("nouvelle solde est  " + solde);
    }

    public double getSolde() {
        return solde;
    }
}
