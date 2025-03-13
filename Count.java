class Count
{
public static void main(String args[])
{
int num=9;
int start=1,end=num,count=0;
while(start<=end)
{
if(num%start==0)
{
count++;
}
start++;
}
System.out.println(count==2?num+" is prime":num+" is not prime");
}
}