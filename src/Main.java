import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Kolik zařízení chceš zadat?");
        int count = sc.nextInt();
        sc.nextLine();

        IPrehravac[] prehravace = new IPrehravac[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Pro MP3 zadej (1) ; Pro Smartphone zadej (2) ; Pro Radio zadej (3)");
            int volba = sc.nextInt();
            sc.nextLine();

            switch (volba) {
                case 1:
                    System.out.println("Jaká je značka MP3 přehrávače?");
                    String znacka = sc.nextLine();
                    prehravace[i] = new MP3(znacka);
                    break;

                case 2:
                    System.out.println("Jaký je model Smartphone?");
                    String model = sc.nextLine();
                    prehravace[i] = new Smartphone(model);
                    break;

                case 3:
                    prehravace[i] = new Radio();
                    break;
            }
        }


        for (;;) {

            System.out.println("JAKOU AKCI CHCEŠ PROVÉST");
            System.out.println("Zobrazit všechna zařízení (1)");
            System.out.println("Přehrání (2)"); //index na kterém zařízení má proběhnout
            System.out.println("Zastavení přehrání (3)");
            System.out.println("Přehrát uživatelem specifikovanou písničku (4)");
            int volbaVelka = sc.nextInt();
            sc.nextLine();

            switch (volbaVelka) {
                case 1:
                    System.out.println("Přehrávací zařízení:");

                    for (int u = 0; u < prehravace.length; u++) {
                        System.out.println( (u+1) + ". Zařízení: " +prehravace[u].toString());
                    }
                    break;

                case 2:
                    System.out.println("NA JAKÉM ZAŘÍZENÍ CHCEŠ PŘEHRÁNÍ USKUTEČNIT ???");
                    int volbaZarizeni = sc.nextInt();
                    sc.nextLine();
                    if (volbaZarizeni > prehravace.length || volbaZarizeni < prehravace.length) {
                        System.out.println("ŠPATNĚ - ZNOVU");
                    }else{
                        prehravace[volbaZarizeni -1].prehraj(true);
                    }

                    break;

                case 3:
                    System.out.println("NA JAKÉM ZAŘÍZENÍ CHCEŠ PŘEHRÁNÍ ZASTAVIT ???");
                    int volbaZarizeniZastavit = sc.nextInt();
                    sc.nextLine();
                    if (volbaZarizeniZastavit > prehravace.length || volbaZarizeniZastavit < prehravace.length) {
                        System.out.println("ŠPATNĚ - ZNOVU");
                    }else{
                        prehravace[volbaZarizeniZastavit -1].prehraj(false);
                    }
                    break;

                case 4:
                    System.out.println("SPECIFIKUJ PÍSNIČKU");
                    String pisnicka = sc.nextLine();

                    System.out.println("NA JAKÉM ZAŘÍZENÍ CHCEŠ PŘEHRÁNÍ USKUTEČNIT ???");
                    volbaZarizeni = sc.nextInt();
                    sc.nextLine();
                    if (volbaZarizeni > prehravace.length || volbaZarizeni < prehravace.length) {
                        System.out.println("ŠPATNĚ - ZNOVU");
                    }else{
                        prehravace[volbaZarizeni -1].prehraj(true);
                        prehravace[volbaZarizeni -1].prehraj(pisnicka);
                    }

                    break;

                default:
                    System.out.println("ŠPATNĚ - ZADEJ ZNOVU");
                    break;





            }

        }


    }
}