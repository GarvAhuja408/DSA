class Main {
    public static long divide(int dividend,int divisor){
        boolean isPositive = true;
        
        if (dividend >= 0 && divisor < 0) 
            isPositive = false;
        else if (dividend < 0 &&divisor >= 0)
            isPositive = false;
            
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        
        int result = 0;
        while(a>=b){
            int count = 0;
            while(a>=(b<<(count+1))){
                count++;
            }
            result += 1<<count;
            a -= (b<<count);
        }
        return isPositive ? result : -result;
    }
    public static void main(String[] args) {
        int dividend = -10;
        int divisor = 3;
        System.out.print(divide(dividend,divisor));
    }
}