import java.util.*; 
import java.util.stream.*; 
public class RemoveDuplicatesfromSortedArray{
	public static int convertArrayToSet(int[] nums) { 
		int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
	} 

	public static void main(String args[]) 
	{ 
		String array[] = { "Geeks", "forGeeks", "A Computer Portal" }; 
		System.out.println("Array: "+ Arrays.toString(array));
        int length = convertArrayToSet(array);
	} 
}
