class Do
{
	public static void main(String []args)
	{
		int num=1234,reverse=0;
		do{
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		while(num!=0);
		{
			System.out.println("reversed num is "+reverse);
		}
	}
}