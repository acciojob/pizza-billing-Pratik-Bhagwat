package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingsPrice;
    private int packingBagPrice;
    private int totalPrice;

    private boolean isExtraCheese;
    private boolean isExtraToppings;
    private boolean isPaperBag;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) {
            price = 300;
            toppingsPrice = 70;
        }
        else {
            price = 400;
            toppingsPrice = 120;
        }
        cheesePrice = 80;
        packingBagPrice = 20;
        totalPrice = price;

        isExtraCheese = false;
        isExtraToppings = false;
        isPaperBag = false;
        isBillGenerated = false;

        bill = "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheese) {
            totalPrice = totalPrice + cheesePrice;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppings) {
            totalPrice = totalPrice + toppingsPrice;
            isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        if(!isPaperBag) {
            totalPrice = totalPrice + packingBagPrice;
            isPaperBag = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated) {
            if(isExtraCheese) bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";
            if(isExtraToppings) bill = bill + "Extra Toppings Added: " + toppingsPrice + "\n";
            if(isPaperBag) bill = bill + "Paperbag Added: " + packingBagPrice + "\n";
            bill = bill + "Total Price: " + totalPrice + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
