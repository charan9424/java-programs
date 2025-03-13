class WhileSum
{
	public static void main(String args[])
	{
		int start=1,end=10,sum=0,product=1;
		while(start<=end)//--------1<10t/2<10t
		{	
			int num=start;
			int root=(int)Math.sqrt(num);//----1square=1/2square=1
			if(root*root==num)//---------1*1=1==1/
			{
				sum=sum+num;//------0+1=1
				product=product*num;//------1*1=1
				System.out.println(num+" is perfect square");
			}
				start++;//----1++=2
		}
		System.out.println("sum of perfect square is "+sum);
		System.out.println("product of perfect square is "+product);
		
	}
}