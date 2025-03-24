public interface IPrehravac {

    public void prehraj(boolean hraj);
    public default void prehraj(String nazevPisnicky){
        System.out.println("Pro zatím není možné vybírat konkretní písničky");
    }

}



