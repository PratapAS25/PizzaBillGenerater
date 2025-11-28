public class Pizza {
    private int price;

    private Boolean Veg;

    private int extraCheesePrice = 100;
    private int extraToppingPrice = 150;
    private int bagPackPrice = 20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraTippingAdded = false;
    private boolean isOptedForTakeAway = false;


    public Pizza(Boolean veg){
        this.Veg = veg;
        if(veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese( ){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraTopping( ){
        isExtraTippingAdded = true;
        this.price += extraToppingPrice;
    }

    public void takeAway( ){
        isOptedForTakeAway = true;
        this.price += bagPackPrice;
    }

    public String getBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Pizza Base Price: ").append(basePizzaPrice).append("\n");
        if (isExtraCheeseAdded) {
            bill.append("Extra Cheese: ").append(extraCheesePrice).append("\n");
        }
        if (isExtraTippingAdded) {
            bill.append("Extra Topping: ").append(extraToppingPrice).append("\n");
        }
        if (isOptedForTakeAway) {
            bill.append("Takeaway Charge: ").append(bagPackPrice).append("\n");
        }
        bill.append("Total: ").append(price).append("\n");
        return bill.toString();
    }

}
