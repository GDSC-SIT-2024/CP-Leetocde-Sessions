class Solution {
public:
    int fib(int n) {
        int first=0,second=1,sum=0;
        if(n==0||n==1){
            return n;
        }
        for(int i=0;i<n;i++){
            first=second;
            second=sum;
            sum=first+second;
        }
        return sum;
    }
};
