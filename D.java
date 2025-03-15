class D
{
	public static void main(String []args)
	{
		int num=12343,count=0,temp=num;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		if(count%2==0)
		{
			num=temp;
			int rem=0,sum=0,fact=1;
			while(num!=0)
			{
				rem=num%100;
				int n1=rem;
				while(n1!=0)
				{
					int rem1=n1/10;
					for(int i=1;i<=rem1;i++)
					{
						fact=fact*i;
					}
					n1=n1/10;
					sum=sum+fact;
				}
				if(rem==sum)
				{
					System.out.println("Strong number");
				}
				num=num/10;
			}
		}
	}
}
