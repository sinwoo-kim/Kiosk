package com.example.kiosk.kiosk4;

public class MenuItem {
    public String name;
    public double price;
    public String info;

    public MenuItem(String name) {
        this(name, 0.0, "");
    }

    public MenuItem(String name, double price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    @Override
    public String toString() {
        if (name.equals("종료")) {
            return name;
        }
        return String.format("%-15s| W %-5s | %s", name, price, info);
    }
}


