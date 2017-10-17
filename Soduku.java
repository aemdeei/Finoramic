public class Solution 
{
	public int isValidSudoku(final List<String> a) 
	{
	    if(a==null)
	        return 0;
	    int rowsize=a.size();
	    int columnsize=a.get(0).length();
	    if(rowsize!=9 || columnsize!=9)
	        return 0;
	    HashSet<Character> b=new HashSet<>();
	    for(int i=0;i<9;i++)//checking each row
	    {
	        b.clear();
	        for(int j=0;j<9;j++)
	        {
	            char c=a.get(i).charAt(j);
	            if(c=='.')
	                continue;
	            else
	            {
	                if(b.contains(c)==true)
	                    return 0;
	            }
	            b.add(c);
	        }
	    }
	    for(int i=0;i<9;i++)//checking each column
	    {
	        b.clear();
	        for(int j=0;j<9;j++)
	        {
	            char c=a.get(j).charAt(i);
	            if(c=='.')
	                continue;
	            else
	            {
	                if(b.contains(c)==true)
	                    return 0;
	            }
	            b.add(c);
	        }
	    }
		//checking in each sub-box
	    for(int k=0;k<9;k++)
	    {
	        int start=k/3;
	        int end=k%3;
	        b.clear();
	        for(int i=(3*start);i<(3*start)+3;i++)//as each sub-box will only contain 3 elements
	        {
	            for(int j=(3*end);j<(3*end)+3;j++)
	            {
	                char c=a.get(i).charAt(j);
	                if(c=='.')
	                    continue;
	                else
	                {
	                    if(b.contains(c)==true)
	                        return 0;
	                }
	                b.add(c);
	            }
	        }
	    }
	    return 1;
	}
}
