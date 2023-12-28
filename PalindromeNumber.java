class PalindromeNumber
 {
    public static int rev(int num){
        int rev=0;
        while(num>0){
        rev=(rev*10)+(num%10);
        num=num/10;}
        return rev;
    }
    public static boolean isPalindrome(int x) {
        if(x==rev(x)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int num=121;
        System.out.println(isPalindrome(num));
    }
}