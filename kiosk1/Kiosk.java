package com.example.kiosk.kiosk1;

public class Kiosk {
    String burgerName;
    double price;
    String info;

    public Kiosk(String burgerName, double price, String info) {
        this.burgerName = burgerName;
        this.price = price;
        this.info = info;
    }

    @Override
    public String toString() {
        return String.format("%-20s| W %-5s | %s", burgerName, price, info);
    }
}
