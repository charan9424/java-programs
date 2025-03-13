class Lfact
{
	public static void main(String args[])
{
int num=100,start=1,end=num/2,fact=0;
	while(start<=end)
{
	if(num%start==0)
	fact=start;
	start++;
}
System.out.println(fact);
}
}