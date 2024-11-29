public abstract class ustensile{
    protected int anneefab;
    public ustensile(int a) {
        this.anneefab=a;
    }
    public int getAnnee(){
        return anneefab;
    }
    public void setAnnee(int annee){
        this.anneefab=annee;
    }
    public double calculValeur(int anneeact){
        int age = anneeact - getAnnee();
        double valeur = 0;
        if (age > 50){
            valeur = age -50;
        }
        return valeur;
    }
    public int getAnneefab(){
        return anneefab;
    }
}
