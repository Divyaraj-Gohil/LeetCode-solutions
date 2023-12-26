public class MedianOfTwoSortedArrays{
    public static int MedianOfTwoSortedArrayssol(int[] num1,int[] num2){
        int median=0;
        int total=(num1.length+num2.length);
        int avg=(total/2);
        int start=0,end=num1.length;
        int pt1=(start+end)/2;
        int pt2=avg-pt1;


        return median;
    }
    public static void main(String[] args) {
        int num1[]={1,2,3};
        int num2[]={4,5,6,7};
        
        System.out.println(MedianOfTwoSortedArrayssol(num1, num2));
    }
}