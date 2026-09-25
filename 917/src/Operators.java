import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérek be egy szöveget: ");
        String szoveg = sc.nextLine();

        System.out.print("Kérek be egy szöveget: ");
        char karakter1 = sc.next().charAt(0);

        System.out.print("Kérek be egy szöveget: ");
        char karakter2 = sc.next().charAt(0);

        System.out.print("Kérem az egyik számot: ");
        int szam1 = sc.nextInt();

        System.out.print("Kérem a másik számot: ");
        int szam2 = sc.nextInt();

        System.out.print("Kérem az egyik nem egész számot: ");
        double nemEgeszszam1 = sc.nextDouble();

        System.out.print("Kérem a másik nem egész számot: ");
        double nemEgeszszam2 = sc.nextDouble();

        String szovegszam = szoveg+" "+(szam1+szam2);
        System.out.println(szovegszam);

        double osztas = szam1/szam2;
        System.out.println(osztas);

        double osszeadas = nemEgeszszam1+nemEgeszszam2;
        System.out.println(osszeadas);
        





    }
}
