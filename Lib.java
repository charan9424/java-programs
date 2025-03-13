class Lib
{
	public static void main(String args[])
{
int days=29;
int bookprice=500;
int perday=10,fine=0;
if(days<0)
{
	System.out.println("invalid");
}
else if(days<=15)
{
	System.out.println("don't pay the fine");
}
else if(days<30)
{
	fine=(days-15)*perday;
	System.out.println("fine="+fine);
}
else if(days>30)
{
	System.out.println("you should pay the entire book price = "+bookprice);
}
}
}

