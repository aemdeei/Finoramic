int findStart(int x)
{
	if(x>=0 && x<=2)
		return 0;
	else if(x>=3 && x<=5)
		return 3;
	else
		return 6;
}
int findEnd(int x)
{
	if(x>=0 && x<=2)
		return 2;
	else if(x>=3 && x<=5)
		return 5;
	else
		return 8;
}
boolean valiadateSoduku(String board[][])
{
	boolean result=true;
	for(int i=0;i<board.length;i++)
	{
		for(int j=0;j<board.length;j++)
		{
			if(a[i][j].equals(".")==false)
			{	
				int count1=0,count2=0,count3=0,start,end;//count to check number of repeatition
				for(int k=0;k<board.length;k++)//checking presence of repitition in the same row
				{
					if(a[i][j].equals(a[i][k])==true)
						count1++;
				}
				if(count1>1)//repitition found
					result=false;
				for(k=0;k<board.length;k++)//checking presence of repeatition in the same column
				{
					if(a[i][j].equals(a[k][j])
						count2++;
				}
				if(count2>1)
					result=false;
				start=findStart(i);//start function to return the starting and ending of sub-box
				end=findEnd(j);
				for(k=start;k<=end;k++)//checking repeatition inside the sub-box
				{ 
					for(int l=start;l<end;l++)
					{
						if(a[k][l].equals(a[i][j])==true)
							count3++;
					}
				} 
				if(count3>1)
					result=false;
			}
			if(result==false)
				break;
		}
		if(result==false)
			break;
	}
	return result;
}