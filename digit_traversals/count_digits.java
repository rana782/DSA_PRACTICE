static int evenlyDivides(int N){
    // code here
    
    int ans = 0;
    int original = N;
    
    while(N!=0){
        int rem = N%10;
        if(rem!=0){
             if(original%rem == 0){
            ans++;
        }
        }
       
        N = N/10;
    }
    return ans;
}