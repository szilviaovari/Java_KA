import java.util.Scanner;

public class South {
    static void main() {
        //1.feladat
        String msg = "I'm happy today.";
        System.out.print(msg+" ");
        int a = 150;
        System.out.println(a);
        int o = 0226;
        System.out.println(o);
        int h = 0x96;
        System.out.println(h);
        double d = 10;
        System.out.println(d);

        //2.feladat
        Scanner sc = new Scanner(System.in);

        System.out.print("kérek egy kedvenc zeneszámot: ");
        String zeneszam = sc.nextLine();

        System.out.print("kérek egy kedvenc ételt: ");
        String etel = sc.nextLine();

        System.out.print("kérek egy kedvenc hobbit: ");
        String hobbi = sc.nextLine();

        System.out.print("kérek egy kedvec filmet: ");
        String film = sc.nextLine();

        System.out.print("kérek egy úticélt: ");
        String uticel = sc.nextLine();

        System.out.println("A kedvenc zeneszámod: "+zeneszam);
        System.out.println("A kedvenc ételed: "+etel+", hobbid: "+hobbi);
        System.out.println("Kedvenc filmed: "+film);
            System.out.println("Úticélod: "+uticel);
    }
}
