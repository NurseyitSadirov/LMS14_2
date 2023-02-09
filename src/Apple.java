public class Apple extends Fruits{

    private VitaminA vitaminA;

    public Apple(String bloom, int price, VitaminA vitaminA) {
        super(bloom, price);
        this.vitaminA = vitaminA;
    }

    public VitaminA getVitaminA() {
        return vitaminA;
    }

    public void setVitaminA(VitaminA vitaminA) {
        this.vitaminA = vitaminA;
    }

    @Override
    public String toString() {
        return "Apple  { " +
                "" + vitaminA +
                " }" + super.toString();
    }
}
