class Solution {
    private static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        
        long evenpos=(n+1)/2;
        long oddpos=n/2;
        long total=(pow(5,evenpos)*pow(4,oddpos))%MOD;
        return (int)total;
    }

    private long pow(long base,long exp){
        long ans=1;
        base%=MOD;
        while(exp>0){
            if(exp%2==1){
                ans=(ans*base)%MOD;
                
            }
            base=(base*base)%MOD;
            exp/=2;
        }
        return ans;
    }

    
}
