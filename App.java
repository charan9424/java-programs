class App
{
public static void main(String args[])
{
int price=2000;
byte quantity=2;
short coupon=100;
long delcha=50;
double discount=10.0;
float tax=5.4f;
double total=((price*quantity-coupon)+(delcha)-(price/discount*100*quantity)+(price/tax*100*quantity));
System.out.println("price is="+price+"\n"+"quantity is="+quantity+"\n"+"coupon is="+coupon+"\n"+"delcha is="+delcha+"\n"+"discount is="+discount+"\n"+"tax is="+tax);
System.out.println("total is="+total);

}
} 