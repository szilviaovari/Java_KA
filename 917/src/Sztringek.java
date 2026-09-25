import java.util.Scanner;

public class Sztringek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem a felhasználó vezetéknevét: ");
        String veznev = sc.nextLine();

        System.out.print("Kérem a felhasználó keresztnevét: ");
        String kernev = sc.nextLine();

        System.out.print("Kérem a felhasználó születési helyét: ");
        String szulHely = sc.nextLine();

        System.out.print("Kérem a felhasználó életkorát: ");
        int eletkor = sc.nextInt();

        String fullName = veznev+" "+kernev;
        System.out.println("Teljes neve: "+fullName.toUpperCase());

        System.out.println("Keresznév ebbe az indexbe található: "+fullName.indexOf(kernev));

        System.out.println("Teljes neve: "+fullName.toLowerCase()+" születési hely: "+szulHely.toLowerCase());

        System.out.println("Ennyi éves: "+eletkor+" teljes neve: "+fullName+" és születési helye: "+szulHely);

        if(kernev.startsWith("A"))
        {
            System.out.println("A keresztnév \"A\" betűvel kezdődik.");
        }
        else{
            System.out.println("A keresztnév nem \"A\" betűvel kezdődik.");
        }

        if(veznev.endsWith("t"))
        {
            System.out.println("A vezetéknév \"t\" betűvel végződik.");
        }
        else{
            System.out.println("A vezetéknév nem \"t\" betűvel végződik.");
        }

        System.out.println("Teljes név hossza: "+fullName.length());

        System.out.println("Kicserélt teljes név: "+fullName.replace('i','y'));






    }
}
