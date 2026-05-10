class Main {
    public static void appearingonce(int nums[]){
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        //rightmost set bit
        int exclusivebit = 0;
        while(true){
            if( (xor&1) == 1 ){
                break;
            }
            xor = xor >> 1;
            exclusivebit++;
        }
        int setbucket = 0;
        int unsetbucket = 0;
        for(int i=0;i<nums.length;i++){
            if(( (nums[i]>>exclusivebit)&1 )==1){
                setbucket = setbucket ^ nums[i];
            }else
                unsetbucket = unsetbucket ^ nums[i];
        }
        System.out.print("Numbers that appear once are"+setbucket+","+unsetbucket);
    }
    public static void main(String[] args) {
        int nums[]={2,2,3,6,3,4,12,4};
        appearingonce(nums);
    }
}