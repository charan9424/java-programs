class Rev
{
public static void main(String [] args)
{
int num=1234,rem=0;
while(num>0)
{
rem=num%10;//4/3/2/1
num=num/10;//123/12/1/0
System.out.print(rem);
}
}
}