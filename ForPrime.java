class ForPrime
{
	public static void main(String []args)
	{
		int num=6,count=0;
		for(int start=2;start<=num/2;start++)
		{
			if(num%start==0)
			count++;
			break;
		}
		System.out.println(count==0 && num>=2?num+" is prime":num+" is not prime"); 
}
}