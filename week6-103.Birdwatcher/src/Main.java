import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        Scanner s= new Scanner (System.in);
        Database db = new Database (s);
        String secim;

        while ( true ) {
            System.out.print ("?");
            secim = s.nextLine ();

            if (secim.equals ("Quit")){
                break;
            }

            else if (secim.equals ("Add")) {
                db.add ();
            }

            else if (secim.equals ("Observation")) {
                db.observation ();
            }

            else if (secim.equals ("Statistics")) {
                db.statistics ();
            }
            else if (secim.equals ("Show")) {
                db.show ();
            }
        }
    }


}
