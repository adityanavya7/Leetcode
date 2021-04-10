class Solution 
{
    boolean isPrime(int num)
    {
 
        if (num == 2)
            return true;
 
        else if (num % 2 == 0)
            return false;
        
        for (int i = 3; i <= Math.sqrt(num); i += 2) 
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public int countPrimes(int n) 
    {
        int c = 0;
        for(int i = 2; i < n; i++)
        {
            if(isPrime(i))
                c++;
        }
        return c;
    }
}