public class ZigzagConversion{
    public static void main(String[] args) {
        int arr[][]=new int[3][10];
        int i=0,j=0,row=3,a=0,col=0;
        String s="123456789";
           while(a!=s.length()){
             for(i=0;i<row;i++){
                arr[i][col]=s.charAt(a);
                a++;
            }col++;
            for(j=col;j<=0;j--){
                arr[row-1][col++]=s.charAt(a);
                a++;
            }
        }
        for(int k=0;k<arr.length;k++){
            for(int l=0;l<arr[0].length;l++){
                System.out.print(arr[k][l]);
            }System.out.println();
        }
    }
    
}