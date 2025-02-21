public class MakingArrays {

    int[] nums;
    public double total;



    public static void main(String[] args) {
        System.out.println("Hello world!");
        MakingArrays make = new MakingArrays();

    }


//making arrays
    public MakingArrays() {
        System.out.println("Making arrays");
        nums = new int[33];
        for(int x=0;x<nums.length;x=x+1) {
            nums[x] = (int) (100 * Math.random());
        }
        for(int x=0;x<nums.length;x++){
            total = total+nums[x];
        }
//        nums[0] = 10;
//        nums[1] = 5;
//        nums[2] = nums[1] * 3;
//        nums[3] = 2;
//        nums[4] = 4;
//        nums[5] = 100;
//        nums[6] = 68;
//        nums[7] = 30;
//        nums[8] = 79;
//        nums[9] = 37;
//        nums[10] = 43;
//calls print
        printArray();
    }
//prints out code
    public void printArray() {
        for (int x = 0; x < 33; x++) {
            System.out.println(nums[x]);
//        System.out.println(nums [1]);
//        System.out.println(nums [2]);
//        System.out.println(nums [3]);
//        System.out.println(nums [4]);
//        System.out.println(nums [5]);
//        System.out.println(nums [6]);
//        System.out.println(nums [7]);
//        System.out.println(nums [8]);
//        System.out.println(nums [9]);
//        System.out.println(nums [10]);

        }
        System.out.println("total " + total);
    }
}
