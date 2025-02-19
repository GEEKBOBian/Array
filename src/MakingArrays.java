public class MakingArrays {

    int[] nums = new int[3];
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MakingArrays make = new MakingArrays();

    }
    public MakingArrays(){
        System.out.println("Making arrays");
        nums [0] = 10;
        nums [1] = 5;
        nums [2] = nums [1]*3;
        printArray();
    }
    public void printArray(){
        System.out.println(nums [0]);
        System.out.println(nums [1]);
        System.out.println(nums [2]);
    }
}
