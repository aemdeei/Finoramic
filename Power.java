int power(int x,int n,int d)
{
	int r=(int)(Math.pow(x,n))%d;//type conversion needed as will produce a double value
	if(r<0)
		return(Integer.MIN_VALUE);//returning absurd value
	else
		return r;
}
