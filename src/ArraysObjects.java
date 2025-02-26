public class ArraysObjects {

    public static void main(String[] args) {
        ArraysObjects a = new ArraysObjects();
    }

    Sushi[] soosh = new Sushi [10];

    public ArraysObjects(){
        System.out.println("hehe");
        Sushi s = new Sushi();
        soosh[0] = s;
        soosh[0].printInfo();

    }

}
