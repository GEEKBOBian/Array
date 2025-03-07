public class ArraysObjects {

    public static void main(String[] args) {
        ArraysObjects a = new ArraysObjects();
    }

    Sushi[] soosh = new Sushi [10];

    public ArraysObjects(){
        System.out.println("array");
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
        changeSize();
        printArray();
        totalSushi();
        largestSushi();
        expensiveSushi();

    }

    public void printArray(){
        for(int x=0 ; x< soosh.length ; x++){
            soosh[x].printInfo();
        }

    }
    public void changeSize(){
        for(int x=0;x<soosh.length; x++){
            soosh[x].size = (int)(Math.random() *10)+ 10;
        }
    }
    public void totalSushi(){
        int sum =0;
        for(int x=0; x<soosh.length ; x++){
            sum = sum +soosh[x].size;
        }

        System.out.println("the sum of the sushi is " + sum);
    }
    public void largestSushi(){
int bigNumber =0;
        for(int x=0 ; x < soosh.length ; x++){
            if (bigNumber < soosh[x].size){
                bigNumber = soosh[x].size;
            }
        }
        System.out.println(bigNumber);
    }
    public void expensiveSushi(){
        double bigPrice = 0;
        for(int x=0 ; x < soosh.length ; x++){
            if (bigPrice < soosh[x].price){
                bigPrice = soosh[x].price;
            }
        }
        System.out.println(bigPrice);
    }


}
