class College {
public static void main(String args[])
{
int rank=120;
        if (rank <= 10)
 {
            System.out.println("Top College (A+)");
 }
else if (rank <= 50)
 {
            System.out.println("Good College (A)");
 }
else if (rank <= 100)
 {
            System.out.println("Average College (B+)");
 }
else if (rank <= 200)
 {
            System.out.println("Decent College (B)");
 }
else if (rank <= 500)
 {
            System.out.println("Acceptable College (C+)");
 }
else 
{
            System.out.println("Below Average College (C)");
}
    

            System.out.println();
}
}