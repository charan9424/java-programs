class Table
{
	public static void main(String args[])
	{
		int start=1,end=10,table=3,product=1;//---------start=1,product=1
		while(start<=end)
		{
			product=table*start;//---------3*1=3/3*2=6/3*3=9/3*4=12/3*5=15/3*6=18/3*7=21/3*8=24/3*9=27/3*10=30
			System.out.println(start+"X"+table+"="+product);
			start++;
		}
	}
}