public class Smartphone implements IPrehravac{

    private String model;

    public Smartphone(String model) {
        this.model = model;
    }

    @Override
    public void prehraj(boolean hraj){
        if(hraj){
            System.out.println("Přehrávání na mobilu " +model+ " spuštěno");
        }else{
            System.out.println("Přehrávání na mobilu " +model+ " ukončeno");
        }
    }















}
