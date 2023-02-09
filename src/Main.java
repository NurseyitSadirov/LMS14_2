public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange("Blue", 120, new VitaminC("Vitamin A"));
        System.out.println(orange);
        Banana banana = new Banana("Black",150,new VitaminD("Vitamin D"));
        System.out.println(banana);
        Apple apple = new Apple("Yellow",80,new VitaminA("Vitamin A"));
        System.out.println(apple);
    }
}