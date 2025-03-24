import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {




        System.out.println("Chceš zapisovat (1) nebo zobrazovat (2) ?");



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





        //IPrehravac[] zarizeni = new IPrehravac[3];
        //zarizeni[0] = new MP3("Lenbovo");
        //zarizeni[1] = new Smartphone("X69-a");
        //zarizeni[2] = new Radio();
        //MP3 mp3 = new MP3(znacka)
        //        prehravace[i] = mp3








    }
}