public class Banana extends Fruits{

    private VitaminD vitaminD;

    public Banana(String bloom, int price, VitaminD vitaminD) {
        super(bloom, price);
        this.vitaminD = vitaminD;
    }

    public VitaminD getVitaminD() {
        return vitaminD;
    }

    public void setVitaminD(VitaminD vitaminD) {
        this.vitaminD = vitaminD;
    }

    @Override
    public String toString() {
        return "Banana {" +
                " " + vitaminD +
                "}" + super.toString();
    }
}
