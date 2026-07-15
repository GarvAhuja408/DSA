
class Main {
    public static int search(int arr[],int k){
        int start = 0; //0 4 4
        int end = arr.length-1; //6 6 5
        
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]==k){
                return mid;
            }
            else if( arr[start]<=arr[mid] ){
                if(k>=arr[start] && k<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else{
                if(k>arr[mid] && k<=arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int arr[]={4, 5, 6, 7, 0, 1, 2};
       int k = 3;
      System.out.println(search(arr,k));
    }
}