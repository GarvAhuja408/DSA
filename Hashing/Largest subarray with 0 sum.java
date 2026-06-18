import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10};
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        int sum=0;
        int len=0;
        
        for(int j=0;j<arr.length;j++){
            sum = sum + arr[j];
            
            if(map.containsKey(sum)){
                len = Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        System.out.print(len);
    }
}