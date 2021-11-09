package com.company;

public class Asus implements LaptopShop{
    private final String model = "Asus tug gaming";
    private final int price = 480000;
    private final String ram = "8gb";
    private final String videoCard = "gf gtx 1660ti";
    private final String storage = "ssd 512gb";
    @Override
    public void info() {
        System.out.println("model " + this.model + ", price " + this.price + ", ram " + this.ram + ", videoCard "+ this.videoCard +", storage " +this.storage);
    }
}
