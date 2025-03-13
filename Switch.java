class Switch
{
	public static void main(String args[])
{
	int num1=10,num2=20;
	char c='*';
	switch(c)
	{
		case'+':
		System.out.println(num1+num2);
		break;
		case'-':
		System.out.println(num1-num2);
		break;
		case'*':
		System.out.println(num1*num2);
		break;
		case'/':
		System.out.println(num1/num2);
		break;
		case'%':
		System.out.println(num1%num2);
		break;
		case'>':
		System.out.println(num1>num2?num1+" big":num2+" big");
		break;
		case'<':
		System.out.println(num1<num2?num2+" big":num1+" big");
		break;
		default:
		System.out.println("invalid");
		break;

	}
}
}