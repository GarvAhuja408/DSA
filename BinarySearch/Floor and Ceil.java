class Main {
    public static int ceil(int arr[],int x){
        int start = 0; //0
        int end = arr.length-1; //4
        int ans = -1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]>=x){
                ans=arr[mid];
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static int floor(int arr[],int x){
        int start = 0; //0
        int end = arr.length-1; //6
        int ans = -1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]<=x){
                ans=arr[mid];
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3, 4, 7, 8, 10};
        int x = 11;
        System.out.println( "Floor = "+floor(arr,x) );
        System.out.print( "Ceil = "+ceil(arr,x) );
    }
}
