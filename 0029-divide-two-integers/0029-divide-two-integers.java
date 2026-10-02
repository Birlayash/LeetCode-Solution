class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long count=0;
        long dend=Math.abs((long)dividend);
        long sor=Math.abs((long)divisor);
        while(dend>=sor){
            long temp=sor;
            long multiple=1;
            while(dend>=(temp<<1)){
                temp=temp<<1;
                multiple=multiple<<1;
            }
            dend=dend-temp;
            count=count+multiple;
        }
        boolean negative = (dividend < 0) != (divisor < 0);
        return negative ? (int)-count: (int)count;
    }
}