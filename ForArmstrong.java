class ForArmstrong
{
	public static void main(String []args)
	{
		for(int x=1;x<=1000;x++)
		{
			int num=x,sum=0,temp=num,count=0;
			while(num!=0) //1!=0//0!=0f   //10//1!=0t
			{
				num=num/10;//1/10=0  //10/10=1//1/10=0
				count++;//1 //1n//2
				//System.out.println(count);//1 //1
			}
			num=temp;
			while(num!=0)
			{	
				int rem=num%10;
				int power=(int)Math.pow(rem,count);
				sum=sum+power;
				num=num/10;
			}
			if(temp==sum)
			System.out.println(temp+"is Armstrong");
		}
	}
}
		