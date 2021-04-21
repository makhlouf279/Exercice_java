package ma.exelib.projet;

public class Etudiant extends Personne{

    private String cne;


    public Etudiant(int id, String nom, String prenom,String cne) {
        super(id, nom, prenom);
        this.cne=cne;
    }

    @Override
    public String toString() {
        return  super.toString()+" "+
                "mon CNE = " + cne
                ;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }
}
