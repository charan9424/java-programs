class Inc
{
public static void main(String args[])
{
/*int a=10;//11
int b=++a;//11 
System.out.println(a+" "+b);*/

/*int a=20;//21
int b=a++;//20
System.out.println(a+" "+b);*/

/*int a=15;//14
double b=--a;//14
System.out.println(a+" "+b);*/

/*double a=10.0;//9.0
int b=(int)a--;//10.0
System.out.println(a+" "+b);*/

int a=10;//11/10/11
int b=20;//19/20
int c=a++ + a-- - b-- + ++a - ++b;//10+11-20+11-20=-8
System.out.println(a+" "+b+" "+c);
}
}