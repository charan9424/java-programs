class Marks
{
public static void main(String args[])
{
int m=400;
if(m<=600 && m>=550)
	System.out.println("A+");
else if(m<550 && m>=400)
	System.out.println("A");
else if(m<500 && m>=450)
	System.out.println("B");
else if(m<450 && m>=300)
	System.out.println("C");
else if(m<300 && m>=250)
	System.out.println("D");
else if(m<250 && m>=200)
	System.out.println("E");
else if(m<200 && m>=100)
	System.out.println("Fail");
else
	System.out.println("E");
}
}