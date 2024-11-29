public class assietterRonde extends ustensile{
    private double rayon;

    public assietterRonde(int Anneefab , double rayon) {
        super(Anneefab);
        this.rayon = rayon;
    }
    public  double getrayon(){
        return rayon;
    }
    public  void setrayon(double rayon){
        this.rayon = rayon;
    }
    public double calculerSurface(){
        return 3.14 * rayon * rayon;
    }


}
