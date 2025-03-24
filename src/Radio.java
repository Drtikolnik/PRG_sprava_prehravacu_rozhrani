public class Radio implements IPrehravac{

    //private String model;

    //public Radio(String model) {
    //    this.model = model;
    //}

    @Override
    public void prehraj(boolean hraj){
        if(hraj){
            System.out.println("Radio spuštěno");
        }else{
            System.out.println("Radio ukončeno");
        }
    }











}
