public abstract class Drink {

    protected Preparation preparation;

    public Drink(Preparation preparation) {
        this.preparation = preparation;
    }
    public void setPreparation(Preparation preparation) {
        this.preparation = preparation;
    }
    public abstract void make();
}
