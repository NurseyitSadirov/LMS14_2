public class Orange extends Fruits{
    private VitaminC vitaminC;

    public Orange(String bloom, int price, VitaminC vitaminC) {
        super(bloom, price);
        this.vitaminC = vitaminC;
    }

    public VitaminC getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(VitaminC vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public String toString() {
        return "Orange {" +
                " " + vitaminC +
                "}" + super.toString();
    }
}
