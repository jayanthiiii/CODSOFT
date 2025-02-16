import java.util.Scanner;
class Cals
{
int i;
int totalmarks=0;
double averagePercentage;
 void CalGrad()
{
Scanner scan= new Scanner(System.in);
System.out.print("ENTER THE NUM Of Subject:");
int n = scan.nextInt();
for(i=1;i<=n;i++)
{
System.out.print("ENTER THE NAME OF THE SUBJECT"+i+":");
String SUBJECT= scan.next();
System.out.print("ENTER THE MARKS:");
int marks= scan.nextInt();
System.out.println(SUBJECT+"=" + marks);
totalmarks+=marks;
}
System.out.println("SUM OF TOTALMARKS="+totalmarks);
averagePercentage=(double) totalmarks/n;
System.out.println("AVERAGE PERCENTAGE:"+averagePercentage);
}
}
class Grade extends Cals
{
public void Determinegrade()
{
if(averagePercentage>=90)
{
System.out.println("GRADE A");
}
else if(averagePercentage>=80)
{
System.out.println("GRADE B");
}
else if(averagePercentage>=70)
{
System.out.println("GRADE C");
}
else if(averagePercentage>=60)
{
System.out.println("GRADE D");
}
else if(averagePercentage>=50)
{
System.out.println("GRADE E");
}
else
{
System.out.println("FAIL");
}
}
}
class Gradecal
{
public static void main(String[] args)
{
Grade grade=new Grade();
grade.CalGrad();
grade.Determinegrade();
}
}