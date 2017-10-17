public class Solution
{
    public int pow(int x, int n, int d)
	{
	    return (int)bigpow(x, n, d);//new function as long value is needed
	}
	public long bigpow(long x,long n,long d)
    {
        long r;
        if(d==1)
	    {
	        r=0;//as anything mod 1 is divisible by all the numbers     
	    }
	    else
	    {
	        if(n==0)
	        {
	            r=1;//anything to the power 0 is always 1
	        }
	        else if(n==1)
	        {
	            r=x%d;//anything to the power 1 is the number itself
	        }
	        else
	        {
	            if(n%2==1)//power is odd
	            {
	                r=x*bigpow(x,n-1,d);//breaking x^n as x*x^n-1
	            }
	            else//power is even
	            {
	                r=bigpow(((x * x)%d),n/2,d);//breaking x^n as x^2 * x^n/2
	            }
                r=r%d;//as we are only concerned with the remainder
	        }
	    }
	    if(r<0)//result is negative
        {
            r=d+r;
        }
			return r;
    }
}







