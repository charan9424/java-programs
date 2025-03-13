class Palindrome
{
public static void main(String args[])
{
int num=12345,rem=0,reverse=0,temp=num;
while(num!=0)
{
rem=num%10;
reverse=reverse*10+rem;
num=num/10;
}
System.out.println(temp==reverse?temp+" is palindrome":temp+" is not palindrome");
}
}