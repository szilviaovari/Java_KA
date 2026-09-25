public class osztalyok {
    static void main() {
        //1.+2.
        int randomszam1 = (int)Math.round(Math.random()*199)+1;
        int randomszam2 = (int)Math.round(Math.random()*199)+1;

        int max = Math.max(randomszam1,randomszam2);
        System.out.println("A nagyobb szám: "+max);

        int min = Math.min(randomszam1,randomszam2);
        System.out.println("A kisebb szám: "+min);

        //3.
        double negyzetgyok1 = Math.sqrt(randomszam1);
        double negyzetgyok2 = Math.sqrt(randomszam2);
        System.out.println("Az első szám négyzetgyöke: "+negyzetgyok1);
        System.out.println("Az első szám négyzetgyöke: "+negyzetgyok2);

        double abszolut1 = Math.abs(randomszam1);
        double abszolut2 = Math.abs(randomszam2);

        double elteres1 = abszolut1-randomszam1;
        double elteres2 = abszolut2-randomszam2;

        System.out.println("Az első szám eltérése: "+elteres1);
        System.out.println("A második szám eltérése: "+elteres2);
    }
}
