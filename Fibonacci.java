class Fibonacci
{
public static void main(String args[])
{
int start=1,end=17,a=0,b=1,c=0;
while(start<=end)
{
c=a+b;
System.out.println(start+" "+a);
a=b;
b=c;
start++;
}
}
}