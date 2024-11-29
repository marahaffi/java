import java.util.Scanner;
public class Main {
        public static void main (String [] args){
            Scanner scanner= new Scanner(System.in);
            Employer E1=new Employer ();
            Employer E2=new Employer ( "marah","sidi bouzid",8);
            System.out.println("Emtrer employer");
            E1.setnom(scanner.nextLine());
            E1.setadresse(scanner.nextLine());
            E1.setnom(scanner.nextLine());
            E1.affiche();
            E2.affiche();
            System.out.println(E1);
    }

}