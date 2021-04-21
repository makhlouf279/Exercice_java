package ma.exelib.projet;

public class Application {
    public static void main(String[] args) {
        System.out.println("liste des employees: ");
        Employe[]emp =new Employe[2];
        emp[0]=new Employe(1215,"aroua","makhlouf",3500);
        emp[1]=new Employe(1205,"ben ali","Khaled",4250);
        for(Employe a:emp){
            System.out.println(a);
        }

        System.out.println("liste des Etudiants: ");
        Etudiant[]etu=new Etudiant[2];
        etu[0]=new Etudiant(6635,"jean","michel","223658");
        etu[1]=new Etudiant(5525,"adhy","kkjts","225648");
        for(Etudiant e:etu){
            System.out.println(e);
        }

        System.out.println("liste des professeur: ");
        Professeur[]pro=new Professeur[2];
        pro[0]=new Professeur(22563,"kkif","mujd",5586,"pro math");
        pro[1]=new Professeur(552236,"olkdi","llokd",6520,"pro physique");
        for(Personne p:pro){
            System.out.println(p);
        }
        /* 2eme methode
        Personne[]per=new Personne[6];

        System.out.println("liste des employees: ");
        per[0]=new Employe(1215,"aroua","makhlouf",3500);
        per[1]=new Employe(1205,"ben ali","Khaled",4250);
        System.out.println(per[0].toString());
        System.out.println(per[1].toString());

        System.out.println("liste des Etudiants: ");
        per[2]=new Etudiant(6635,"jean","michel","223658");
        per[3]=new Etudiant(5525,"adhy","kkjts","225648");
        System.out.println(per[2].toString());
        System.out.println(per[3].toString());

        System.out.println("liste des professeur: ");
        per[4]=new Professeur(22563,"kkif","mujd",5586,"pro math");
        per[5]=new Professeur(552236,"olkdi","llokd",6520,"pro physique");
        System.out.println(per[4].toString());
        System.out.println(per[5].toString());

*/

    }
}
