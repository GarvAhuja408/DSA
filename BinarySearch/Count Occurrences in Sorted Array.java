class Main {
    public static int lastOccurrence(int arr[],int target){
        
        int start = 0; 
        int end = arr.length-1; 
        int ans=-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    
    public static int firstOccurrence(int arr[],int target){
        
        int start = 0; 
        int end = arr.length-1; 
        int ans=-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    
    public static int countOccurrence(int arr[],int target){
        int first = firstOccurrence(arr,target);
        if(first==-1){
            return 0;
        }
        int last = lastOccurrence(arr,target);
        
        return last-first+1;
    }
    public static void main(String[] args) {
        int arr[]={3, 4, 13, 13, 13, 20,40} ;
        int target = 13;
        System.out.print(countOccurrence(arr,target));
    }
}