package com.company;


import restaurant.Menu;
import restaurant.MenuItem;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Menu myMenu = new Menu();
        printElements(myMenu);

        MenuItem superBurger = new MenuItem(
                "Cheese Burger",
                17.99,
                "the best burger of your life",
                "main course");

        myMenu.addMenuItem(superBurger);
        printElements(myMenu);

        MenuItem chocolateCheeseCake = new MenuItem(
                "Chocolate Cheese Cake",
                10.99,
                "A great dessert",
                "dessert");

        myMenu.addMenuItem(chocolateCheeseCake);
        printElements(myMenu);

        MenuItem invalidItem = new MenuItem(
                "Test Item",
                10.99,
                "A great test",
                "dessert1");

        myMenu.addMenuItem(invalidItem);
        printElements(myMenu);
    }

    public static void printElements(Menu aMenu){
        for(MenuItem d: aMenu.getMenus()) {
            System.out.println(d);
        }
    }
}