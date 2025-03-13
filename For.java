class For
{
public static void main(String args[])
{
int rem=0,reverse=0;
for(int num=1234;num!=0;num=num/10)
{
rem=num%10;//--------4
reverse=reverse*10+rem;//--------4
//-----------123/
}
System.out.println(reverse);
}
}