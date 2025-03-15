class DigitRange
{
	public static void main(String []args)
	{
		for(int x=10;x<=20;x++)
		{
			int num=x;
			System.out.println("\n"+num+" digits are");
			while(num!=0)
			{
				int rem=num%10;//--------01//-----01
				num=num/10;//-----------1/0
				System.out.print(rem+" ");

			}
		}
	}
}