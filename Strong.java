class Strong
{
	public static void main(String args[])
	{
		int num=0,rem=0;
		while(num!=0)
		{
			int pro=1;
			rem=num%10;                 //123%10=3
			for(int i=1;i<=rem;i++)
			{
				pro=pro*i;//1*1=1
			}
			if(pro==rem)
				System.out.println(rem+" is strong number");
			num=num/10;
		}
	}
}