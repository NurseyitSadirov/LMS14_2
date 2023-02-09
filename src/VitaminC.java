public class VitaminC {
    private String vitamin;

    public VitaminC(String vitamin) {
        this.vitamin = vitamin;
    }

    public String getVitamin() {
        return vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return " Vitamin { " +
                "" + vitamin + '\'' +
                ' ';
    }
}
