public class Sushi {

    //variables
    String ingredient;
    String type;
    double price;
    int size;
    boolean isHot;

    public Sushi(double x) {
        System.out.println("hhh");
        ingredient = "rice, tuna, cucumber, soy sauce";
        type = "spicy tuna";
        price = x;
        size = 10;
        isHot = true;
    }

    public void printInfo(){
        System.out.println(ingredient + type + price + size + isHot);
    }


}
