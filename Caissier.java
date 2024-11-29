public class Caissier extends Employer  {
    private int numcaissier;

    public Caissier(String nom, String adresse, int nbr_heure, int numCaissier){
        this.numcaissier=numCaissier;
    }
    public double calculerSalaire(){
        double salaire= nbr_heure*5;
        if(nbr_heure>180){
             salaire+=getnbr_heure();
        }
        return salaire;
    }
}

