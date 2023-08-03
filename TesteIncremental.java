import java.util.Scanner;

public class TesteIncremental {
        public static void main(String[] args) {

            System.out.println("Deseja log em arquivo ou console?");

            Scanner sc = new Scanner(System.in);
            String respo = sc.nextLine();
            sc.close();
            
            Print p = PrintFactory.getPrint(respo);
            p.print();
            
        }
     }