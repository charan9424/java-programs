class Pow
{
public static void main(String args[])
{
int num=12345,rem=0,temp=num,sum=0,count=0;
while(num!=0)
{
rem=num%10;
count++;
int power=(int)Math.pow(rem,count);
num=num/10;
System.out.println(power);
} 
}
}