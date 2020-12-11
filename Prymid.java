package prymid;
import java.util.Scanner;
public class Prymid 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no of Star");//10
	int noOfStar = sc.nextInt();
	int row = (noOfStar/2);
	for(int countStar=1;countStar<=noOfStar;countStar+=2)
	{
	for(int colSpace=1;colSpace<=row;colSpace++)
	{
	System.out.print("  ");
	}
	for(int colStar=1;colStar<=countStar;colStar++)
	{
	System.out.print("* ");
	}
	System.out.println();
	row--;
	}
	}
}
