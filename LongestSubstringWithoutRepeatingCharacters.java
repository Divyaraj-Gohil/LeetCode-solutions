import java.util.List;
import java.util.ArrayList;
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str="abcabcbb";
        int start=0,end=0,maxlength=0;
        List<Character> list=new ArrayList<Character>();

        while(end<str.length()){
            if(!list.contains(str.charAt(end))){
                list.add(str.charAt(end));
                end++;
                maxlength=Math.max(maxlength,list.size());
            }else{
                list.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }System.out.println(maxlength);

    }
}
