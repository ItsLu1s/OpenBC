package com.company;

public class Main {
    public static void main(String[] args) {

        double price = 12.44;
        double totalPrice = getPrecio(price);
        System.out.println(totalPrice);

    }

    static double getPrecio(double price){
        double iva = 4.55;
        return price + iva;
    }
}
