class Armstrong
{
public static void main(String args[])
{
int num=153,count=0,temp=num,sum=0,rem=0;
while(num!=0)
{
count++;
num=num/10;
}
num=temp;
while(num!=0)
{
rem=num%10;
rem=(int)Math.pow(rem,count);
sum=sum+rem;
num=num/10;
}
System.out.println(sum==temp?temp+" is armstrong":temp+" is not armstrong");
}
}