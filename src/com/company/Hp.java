package com.company;

public class Hp  implements LaptopShop{

   private final String model = "Hp pavilion gaming";
   private final int price = 340000;
   private final String ram = "8gb";
   private final String videoCard = "gf gtx 1650ti";
   private final String storage = "ssd 512gb";

    @Override
    public void info() {

        System.out.println("model " + this.model + ", price " + this.price + ", ram " + this.ram + ", videoCard "+ this.videoCard +", storage " +this.storage);
    }
}
