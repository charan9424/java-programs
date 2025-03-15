class ForPalindrome
{
	public static void main(String []args)
	{
		for(int x=1;x<100;x++)
		{
			int num=x,reverse=0,rem=0,temp=num;
			while(num!=0)
			{
				rem=num%10;//------------1%10=1(11%10=1)
				reverse=reverse*10+rem;//----0*10+1=1(1*10+1=11)
				num=num/10;//----------1/10=0(11/10=1,1/10=0)
			}
		if(reverse==temp)
			System.out.println(temp+" is palindrome");
		}
	}
}