class Char
{
	public static void main(String args[])
{
	char s='9';
	if(s>='A' && s<='Z')
	System.out.println("capital");
	else if(s>='a' && s<='z')
	System.out.println("small");
	else if(s>='0' && s<='9')
	System.out.println("digit");
	else if(s==' ')
	System.out.println("space");
	else
	System.out.println("symbol");
}
}