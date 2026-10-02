public class IceTea extends Drink {

    public IceTea(Preparation preparation) {
        super(preparation);
    }
    @Override
    public void make() {
        System.out.println("Ice Tea: ");
        preparation.prepare();
    }
}
