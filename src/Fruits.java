public class Fruits {

    private String bloom;
    private int price;

    public Fruits(String bloom, int price) {
        this.bloom = bloom;
        this.price = price;
    }

    public String getBloom() {
        return bloom;
    }

    public void setBloom(String bloom) {
        this.bloom = bloom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruits {" +
                "bloom: '" + bloom + '\'' +
                ", price: " + price +
                '}';
    }
}
