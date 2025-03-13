class Lyear
{
	public static void main(String args[])
	{
		int start=1600,end=2000;
		while(start<=end)
		{
   			if(start%4==0&&start%100!=0||start%400==0)
				System.out.print(start%6==0?start+" divisible by 6 \n":"");
		start++;
		}
	}
}