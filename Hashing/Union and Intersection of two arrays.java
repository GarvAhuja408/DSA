import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        
        HashSet<Integer>union= new HashSet<>();
        
        for(int i=0;i<arr1.length;i++){
            union.add(arr1[i]);
        }
        
        for(int i=0;i<arr2.length;i++){
            union.add(arr2[i]);
        }
        System.out.println("Union : "+union);
        
        
        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer>intersection = new HashSet<>();
        
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                intersection.add(arr2[i]);
            }
        }
        System.out.print("Intersection :"+intersection);
    }
}