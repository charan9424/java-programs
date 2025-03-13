class Npr
{
	public static void main(String args[])
{
	int start=1,n=5,r=3,nr=n-r,p=1;
	while(start<=n)
	{
		p=p*start;//----------1*1=1/1*2=2/2*3=6/6*4=24/24*5=120
		start++;
	}
		System.out.println(n+" factorial is " +p);
	int nr_start=1,nr_end=nr,nr_p=1;
	while(nr_start<=nr_end)
	{
		nr_p=nr_p*nr_start;//---------1*1=1/1*2=2
		nr_start++;
	}
		System.out.println(nr+" factorial is "+nr_p);
		System.out.println(n+" p " +r+" is "+(p/nr_p));
}
}