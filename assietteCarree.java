public abstract class assietteCarree extends assiette {
    private double cote;
    public assietteCarree(int Annee,double cote){
        super(Annee);
        this.cote = cote;
    }
    public double getcote(){
        return cote;
    }
    public void setcote(double cote){
        this.cote = cote;
    }
}
