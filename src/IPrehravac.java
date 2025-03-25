public interface IPrehravac {

    public void prehraj(boolean hraj);
    public default void prehraj(String pisnicka){
        System.out.println("Právě se přehrává: " +pisnicka);
    }

}



