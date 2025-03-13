class Fact
{
	public static void main(String args[])
	{
		int start=1,end=6,product=1;
		while(start<=end)
		{
			product=product*start;//-----------1*1=1/1*2=2/2*3=6/6*4=24/24*5=120/120*6=720
			/*System.out.println(product);*/
			start++;
		}
			System.out.println(product);
	}
}