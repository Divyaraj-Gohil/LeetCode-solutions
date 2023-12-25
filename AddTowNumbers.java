import java.util.LinkedList;
public class AddTowNumbers {
    public static int rev(int x){
       int reverse=0;
       while(x>0){
       reverse=(reverse*10)+(x%10);
       x=x/10;}
       return reverse;
    }

    public static void main(String[] args) {
        int rev1=0;
        int rev2=0;
        LinkedList<Integer> ll1=new LinkedList<Integer>();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
       
        LinkedList<Integer> ll2=new LinkedList<Integer>();
        ll2.add(4);
        ll2.add(5);
        ll2.add(6);
        
        for(Integer no:ll1){
            rev1=(rev1*10)+(no);
        }
        for(Integer no:ll2){
            rev2=(rev2*10)+(no);
        }
        int ans=rev(rev1)+rev(rev2);
        
        LinkedList<Integer> ll=new LinkedList<Integer>();
        while(ans>0){
            int no=ans%10;
            ll.add(no);
            ans=ans/10;
        }
        System.out.println(ll);
    }
}

