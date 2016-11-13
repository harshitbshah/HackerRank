//Write your code here
class Calculator{
    int power(int a, int b) throws Exception{
        int ori = a;
        if(a < 0 || b < 0)
            throw new Exception("n and p should be non-negative");
        if (b == 0)
            return 1;
        
        for(int i=0; i < b-1; i++){
            a *= ori;
        }
        
        return a;
    }
}