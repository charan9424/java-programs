class Without
{
public static void main(String args[])
{
int a=5,b=10;
System.out.println("before swap:a="+ a +",b=" +b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swap:a="+ a +",b=" +b);
}
}