class DigitSum
{
	public static void main(String []args)
	{
		for(int x=10;x<=20;x++)
		{
			int num=x,temp=num,sum=0;//----10/11
			while(num!=0)
			{
				int rem=num%10;//--------(0/1)(1/1
				sum=sum+rem;//--------(0+1=1)(1+1=2+1=3)
				num=num/10;//------------(1/0)(1/0)
			}
			System.out.println("sum of digits of "+temp+" is "+sum);
		}
	}
}