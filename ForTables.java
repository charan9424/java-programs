class ForTables
{
	public static void main(String args[])
	{
		int num=1234;
		while(num!=0)
		{
			int rem=num%10;
			int table=rem;
			for(int start=1;start<=10;start++)
			{
				int pro=table*start;
								
				System.out.println(table+"x"+start+"="+pro);
				
			}
			num=num/10;
		}
		
	}
}