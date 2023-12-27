import java.util.Arrays;
public class MedianOfTwoSortedArrays{
    public static float MedianOfTwoSortedArrayssol(int[] num1,int[] num2){
        
        int i=0,j=0,length=num1.length+num2.length,x=0;
        float median=0;
        int arr[]=new int[length];

        while(i<num1.length){
            arr[x++]=num1[i++];
        }while(j<num2.length){
            arr[x++]=num2[j++];
        }
        Arrays.sort(arr);
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
        if(length%2!=0){
            median=arr[arr.length/2];
        }else{
          median= (((float)(arr[arr.length/2]))+((float)(arr[(arr.length/2)-1])))/2;
        }
        return median;
    }
    public static void main(String[] args) {
        int num1[]={1,2,3};
        int num2[]={4,5,6};

        System.out.println(MedianOfTwoSortedArrayssol(num1, num2));
    }
}