class Sfact
{
public static void main(String []args)
{
int num=10,start=num,end=2,fact=0;
while(start>=end)
{
if(num%start==0)
fact=start;
start--;
}
System.out.println(fact);
}
}