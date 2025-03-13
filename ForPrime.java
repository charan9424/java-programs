class ForPrime
{
public static void main(String []args)
{
int num=17,count=0;
for(int start=1;start<=num/2;start++)
{
if(num%start==0)
count++;
}
System.out.println(count==1?num+" is prime":num+" is not prime"); 
}
}