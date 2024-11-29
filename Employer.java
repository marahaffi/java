public class Employer {
    private String nom;
    private String adresse;
    int nbr_heure;
    public Employer(String nom,String adresse,int nbr_heure) {
        this.nom=nom;
        this.adresse=adresse;
        this.nbr_heure=nbr_heure;
    }

    public Employer() {

    }

public void affiche(){
        System.out.println(" le nom est "+nom+"adresse est"+adresse+"nbr_heure"+nbr_heure);
}

    public void setnom(String nom) {
       this.nom = nom;
    }
    public void setadresse(String adresse) {
        this.adresse = adresse;
    }
    public void setnbr_heure(int nbr_heure) {
        this.nbr_heure = nbr_heure;
    }
    public String getnom(){
        return nom;
    }
    public String getadresse(){
        return adresse;
    }
    public int getnbr_heure() {
        return nbr_heure;
    }
    public String toString(){
        return nom + ","+adresse + ",";
    }
}
