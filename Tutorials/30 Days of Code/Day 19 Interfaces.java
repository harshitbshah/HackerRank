//Write your code here
class Calculator implements AdvancedArithmetic{
    int sum = 0;
    
    public int divisorSum(int n){
        for(int i = 1; i <=n; i++){
            if(n % i == 0)
                sum += i;
        }
        return sum;
    }
}