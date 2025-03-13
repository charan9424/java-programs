class Price
{
	public static void main(String args[])
{
String pname="moblie";
int pcode=5,pprice=1000,pquantity=5;
double ptotal=pprice*pquantity,pdisc=0;
if(pprice>=1000 && pprice<=2000)
	{
		pdisc=10.0/100*ptotal;
	}
else if(pprice>2000 && pprice<=3000)
	{
		pdisc=15.0/100*pprice;
	}
else if(pprice>3000 && pprice<=4000) 
	{
		pdisc=20.0/100*pprice;
	}
else
	{
		pdisc=30.0/100*pprice;
		if(pdisc>1400)
		{
		pdisc=1400;
		}		
	}
	double ftotal=ptotal-pdisc;
	double tax=18.0/100*ptotal;
	double bill=ftotal+tax;
	System.out.println("Product Name:"+pname);
	System.out.println("Product Code:"+pcode);
	System.out.println("Product Price:"+pprice);
	System.out.println("Product Quantity:"+pquantity);
	System.out.println("Product Total:"+ptotal);
	System.out.println("Product Discount:"+pdisc);
	System.out.println("Product Price After:"+ftotal);
	System.out.println("Product Tax:"+tax);
	System.out.println("Product Bill:"+bill);

}
}