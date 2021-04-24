public class q1b {
    public static void main(String[] args) {
        double[] nums = {3,2,1,42,1};
        int max = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] > max){
                max = i;
            }
        }
        System.out.println(max);


    }
}