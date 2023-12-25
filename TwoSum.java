public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
          int[] sol={};
        for(int i=0;i<nums.length; i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return sol;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int[] nums={1,2,3,4,5};
        int target=4;
    
         twoSum(nums,target);
    }
}

