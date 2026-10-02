public class MilkTea extends Drink {
    public MilkTea(Preparation preparation) {
        super(preparation);
    }
    @Override
    public void make() {
        System.out.println("Milk Tea: ");
        preparation.prepare();
    }
}
