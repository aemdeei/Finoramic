/* Considering a tree who's structure is defined as
	node
       /    \
     left   right */
StringBuffer res=new StringBuffer("");//globally declared string to store the path
String initializePath(Node node, int sum)
{
	boolean b=path(node, sum);
	if(b==true)
	{
		System.out.println(sb.reverse());//will contain a -> in the beginning
		res="";
	}
}
boolean path(Node node, int sum)
{
	if(node==null)
		return false;
	else
	{
		int sumgot;
		boolean found=false;
		sumgot=sum-node.value;
		if(subgot==0 && node.left==null && node.right==null)//if a leaf is found
		{
			res=res+String.valueOf(node.value)+"<-"
			return true;
		}
		if(node.left!=null)
		{
			found==false;
			res=res+String.valueOf(node.value)+"<-"
			path(node.left, sumgot, res);
		}
		if(node.right!=null)
		{
			found=false;
			res=res+String.valueOf(node.value)+"<-"
			path(node.right, sumgot, res);
		}
	}
}
