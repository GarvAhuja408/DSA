class Main {
    public static int searchInsertPos(int arr[],int x){
        int start = 0; 
        int end = arr.length-1; 
        int ans = arr.length;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]>=x){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,7};
        int x = 6;
        System.out.print( searchInsertPos(arr,x) );
    }
}
