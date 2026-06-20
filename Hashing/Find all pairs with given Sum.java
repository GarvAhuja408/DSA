import java.util.*;
class Main {
    public static void pairWithSumK(int arr[],int k){
        HashSet<Integer>set=new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            int key = k-arr[i];
            
            if(set.contains(key)){
                System.out.println("("+key+","+ arr[i]+")");
            }
            set.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,5,7,-1,5};
        int k = 6;
        pairWithSumK(arr,k);
    }
}
