class Msqrt
{
	public static void main(String args[])
	{
		int start=1,end=10;         //--------start=1,start=2
		while(start<=end)
		{
			if(Math.sqrt(start)==(int)Math.sqrt(start))      //---------1 root=1,2 root=1
				System.out.println(start+" perfect square is "+ (int)Math.sqrt(start));
			else
				System.out.println(start+" not perfect square");
			start++;            //-------inc start+1
		}
	}
}