class Nest
{
	public static void main(String args[])
{
int age=9;
String gender="female";
String qualification="phd";
System.out.println(age>=60?gender=="male"?"retairment amount 35,000 because you are a male senior citizen":"retairment amount 30,000 because you are a female senior citizen":
age>=18?
qualification=="ug"?
"scholarship amount 30000 because you are a ug":qualification=="Pg"?"scholarship amount 40000 because you are a pg":"scholarship amount 20000 because you are neither ug nor pg":"you are not eligible for scholarship because you are minor");
}
}
