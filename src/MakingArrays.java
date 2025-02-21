public class MakingArrays {

    int[] nums = new int[11];
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MakingArrays make = new MakingArrays();

    }
    public MakingArrays(){
        System.out.println("Making arrays");
        nums [0] = 10;
        nums [1] = 5;
        nums [2] = nums [1]*3;
        nums [3] = 2;
        nums [4] = 4;
        nums [5] = 100;
        nums [6] = 68;
        nums [7] = 30;
        nums [8] = 79;
        nums [9] = 37;
        nums [10] = 43;

        printArray();
    }
    public void printArray(){
        System.out.println(nums [0]);
        System.out.println(nums [1]);
        System.out.println(nums [2]);
        System.out.println(nums [3]);
        System.out.println(nums [4]);
        System.out.println(nums [5]);
        System.out.println(nums [6]);
        System.out.println(nums [7]);
        System.out.println(nums [8]);
        System.out.println(nums [9]);
        System.out.println(nums [10]);

    }
}
