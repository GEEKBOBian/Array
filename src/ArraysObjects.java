public class ArraysObjects {

    public static void main(String[] args) {
        ArraysObjects a = new ArraysObjects();
    }

    Sushi[] soosh = new Sushi [10];

    public ArraysObjects(){
        System.out.println("hehe");
//        Sushi s = new Sushi();
//        soosh[0] = s;
//        soosh[0].printInfo();

        Sushi s1 = new Sushi(10);
        soosh[1] = s1;
        soosh[1].printInfo();

        for(int x=0 ; x<10 ; x++){
            soosh[x] = new Sushi(Math.random()*250);
            //soosh[x].printInfo();

        }
        printArray();

    }

    public void printArray(){
        for(int x=0 ; x< soosh.length ; x++){
            soosh[x].printInfo();
        }

    }
    public void chageSize(){
        for(int x=0;x<soosh.length; x++){
            soosh[x].size = (int)(Math.random() *10)+ 10;
        }
    }

}
