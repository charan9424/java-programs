class Max
{
public static void main(String args[])
{
int a=122,b=124,c=100,start=1,max=0;
while(start<=a && start<=b && start<=c)
{
if(a%start==0 && b%start==0 && c%start==0)
{
System.out.println(start);
max=start;
}
start++;
}
System.out.println("max is "+max);
}
}