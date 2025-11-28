public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraTopping();
    }

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraTopping() {}
}
