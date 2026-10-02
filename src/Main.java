public class Main {
    public static void main(String[] args) {
        Preparation traditional = new TraditionalPreparation();
        Preparation automatic = new AutomaticPreparation();

        Drink drink1 = new MilkTea(traditional);
        Drink drink2 = new IceTea(automatic);

        drink1.make();
        drink2.make();

        drink1.setPreparation(automatic);
        drink1.make();

        drink2.setPreparation(automatic);
        drink2.make();
    }
}