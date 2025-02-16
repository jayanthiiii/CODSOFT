import java.util.Random;
import java.util.Scanner;
class Ran
{
static int randomnumber;
public static void generateNumber()
{
Random random = new Random();
randomnumber=random.nextInt(100)+1;
System.out.println(randomnumber);
}
}
class Generate extends Ran
{
public static void main(String[] args)
{
generateNumber();
int chances = 3;
Scanner scan= new Scanner(System.in);
for(int i=1;i<=chances;i++)
{
System.out.println("guess the number"+"(chance"+i+"):");
int num = scan.nextInt();
if(randomnumber==num)
{
System.out.println("YOUR GUESS IS CORRECT");
break;
}
else
{
if(randomnumber>num)
{
System.out.println("YOUR GUESS IS TOO LOW!!!");
}
else
{
System.out.println("YOUR GUESS IS TOO HIGH!!");
}
}
}
System.out.println("THE CORRECT ANSWER IS:"+randomnumber);
}
}