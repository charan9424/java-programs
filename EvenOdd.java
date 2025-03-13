class EvenOdd
{
public static void main(String args [])
{
int num=123,sum=0,count=0,z=0,temp=num;
while(num!=0)
{
count++;//-----------1/2/3/4
num=num/10;//--------------1235/123/12/1
}
num=temp;
if(count%2==0)
{
count=count/2;//--------4/2=2
int power=(int)Math.pow(10,count);//-------10*10=100
z=num%power;//---------1235%100=35
num=num/power;//--------1235/100=12
sum=z+num;//12+35=47
System.out.println(temp+" is even and sum is "+sum);
}
else
{
z=num%10;//-------------/3
num=num/10;//---------/12
sum=num+z;//---------3+12=15
System.out.println(temp+" is odd and sum is "+sum);
}
}
}