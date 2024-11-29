public class Main {
    private final static int CURRENT_YEAR = 2009;
    public static void main(String[] args) {
        ustensile[] us = new ustensile[5];
        us[0] = new assietterRonde(1926, 8.4);
        us[1] = new cuillere(1881, 7.3);
        us[2] = new assietteCarree(1935, 5.6) {
            @Override
            public double calculesurfce() {
                return 0;
            }
        };
        us[3] = new cuillere(1917, 8.8);
        us[4] = new assietterRonde(1837, 5.4);
    }
    static void afficherCuilleres(ustensile[] us) {
        int nbCuilleres = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof cuillere) {
                nbCuilleres++;
            }
        }
        System.out.println("Il y a " + nbCuilleres + " cuillere.");
    }
    static void afficherSurfaceAssiettes(ustensile[] us) {
        double somme = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof assiette) {
                somme = somme + ((assiette) us[i]).calculesurfce();
            }
        }
        System.out.println("Surface totale des assiettes : " + somme);
    }
    static void afficherValeurTotale(ustensile[] us) {
        double somme = 0;
        for (int i = 0; i < us.length; i++) {
            somme = somme + us[i].calculValeur(CURRENT_YEAR);
        }
        System.out.println("Valeur totale de la collection : " + somme);
    }
}