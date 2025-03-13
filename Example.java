class Example
{
public static void main(String args[])
{
int num=1200,rem=0,reverse=0;
while(num!=0)
{
rem=num%10;
reverse=reverse*10+rem;
num=num/10;
}
while(reverse!=0)
{
rem=reverse%10;
System.out.println(rem);
reverse=reverse/10;
}
}
}