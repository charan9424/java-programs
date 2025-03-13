class Fizz
{
public static void main(String args[])
{
int num=2;
if(num%3==0 && num%5==0)
	System.out.println("Fizz amd Buzz");
else if(num%7==0 || num%9==0)
	System.out.println(num%10);
}
}