class Reve
{
	public static void main(String []args)
	{
		int num=2100,reverse=0,temp=num,rem=0,count=0,pro=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem==0)
			count++;
			reverse=reverse*10+rem;
			num=num/10;
		}
		num=reverse;
		reverse=0;
		while(num!=0)
		{        //reverse=0012

			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;			
		}
		int power=(int)Math.pow(10,count);
		pro=reverse*power;
		System.out.println(pro);
	}
}