public class MP3 implements IPrehravac{

    private String znacka;
    private String pisnicka;

    public MP3(String znacka) {
        this.znacka = znacka;
    }

    @Override
    public void prehraj(boolean hraj){
        if(hraj){
            System.out.println("Přehrávání MP3 zažízení značky: " +znacka);
        }else{
            System.out.println("Přehrávání MP3 zažízení značky: " +znacka+ " MP3 ukončeno");
        }
    }

    public String toString(){
        return "MP3 přehrávač: " +znacka;
    }


}
