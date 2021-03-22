package linecompare;

//import java.math.*;
import java.util.*;

public class LineComparision {

	public static void main(String[] args) {

		System.out.println("Well Come To Line Comparision Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1 ");
		int x1 = sc.nextInt();
		System.out.print("Enter x2 ");
		int x2 = sc.nextInt();
		System.out.print("Enter y1 ");
		int y1 = sc.nextInt();
		System.out.print("Enter y2 ");
		int y2 = sc.nextInt();
		int length_of_line = ((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		System.out.println("Length of line is =" + Math.sqrt(length_of_line));

	}

}
