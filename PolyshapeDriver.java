import java.util.Scanner;

public class PolyshapeDriver {

	final static int ONE = 1;
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		int[] sideLengths = new int[4];
		int[] triangle = new int[3];
		
		PolyShape p1 = new Quadrilateral(0, null);
		PolyShape p2 = new Rectangle(0, null);
		PolyShape p3 = new Square(0, null);
		PolyShape p4 = new Triangle(0, null, false, false);
		
		// QUADRILATERAL
		System.out.print("***CREATE A QUADRILATERAL***\n"
				+ "\nENTER NUMBER OF SIDES: ");
		int quadSides = user.nextInt();
		p1.setNumSides(quadSides);
		
		System.out.println("ENTER THE LENGTH FOR EACH SIDE: ");
		for (int i = 0; i < sideLengths.length; i++)
		{
			sideLengths[i] = user.nextInt();
			p1.setSideLengths(sideLengths);
		}
		
		System.out.println("The perimeter is: " + p1.getPerimeter());
		System.out.println(p1.toString());
		System.out.println("");
		
		// PRINT SHAPE
		for (int i = 1; i <= sideLengths[0]; i++)
		{
			for (int j = 0; j <= sideLengths[2] - ONE; j++)
			{
				System.out.print("*");
			}		
			System.out.println("");
		}

		System.out.println("");
		
		// RECTANGLE
		System.out.print("***CREATE A RECTANGLE***\n"
				+ "\nENTER NUMBER OF SIDES: ");
		int rectSides = user.nextInt();
		p2.setNumSides(rectSides);
		
		System.out.println("ENTER THE LENGTH FOR EACH SIDE: ");
		for (int i = 0; i < sideLengths.length; i++)
		{
			sideLengths[i] = user.nextInt();
			p2.setSideLengths(sideLengths);
		}
		
		System.out.println("The perimeter is: " + p2.getPerimeter());
		System.out.println(p2.toString());
		System.out.println("");
		
		// PRINT SHAPE
		for (int i = 1; i <= sideLengths[0]; i++)
		{
			for (int j = 0; j <= sideLengths[2] - ONE; j++)
			{
				System.out.print("*");
			}		
			System.out.println("");
		}

		System.out.println("");
		
		// SQUARE
		System.out.print("***CREATE A SQUARE***\n"
				+ "\nENTER NUMBER OF SIDES: ");
		int squareSides = user.nextInt();
		p3.setNumSides(squareSides);
		
		System.out.println("ENTER THE LENGTH FOR EACH SIDE: ");
		for (int i = 0; i < sideLengths.length; i++)
		{
			sideLengths[i] = user.nextInt();
			p3.setSideLengths(sideLengths);
		}
		
		System.out.println("The perimeter is: " + p3.getPerimeter());
		System.out.println(p3.toString());
		System.out.println("");
		
		// PRINT SHAPE
		for (int i = 1; i <= sideLengths[0]; i++)
		{
			for (int j = 0; j <= sideLengths[2] - ONE; j++)
			{
				System.out.print("*");
			}		
			System.out.println("");
		}

		System.out.println("");
		
		// TRIANGLE
		System.out.print("***CREATE A TRIANGLE***\n"
				+ "\nENTER NUMBER OF SIDES: ");
		int triSides = user.nextInt();
		p4.setNumSides(triSides);
		
		System.out.println("ENTER THE LENGTH FOR EACH SIDE: ");
		for (int i = 0; i < triangle.length; i++)
		{
			triangle[i] = user.nextInt();
			p4.setSideLengths(triangle);
		}
		
		System.out.println("The perimeter is: " + p4.getPerimeter());
		System.out.println(p4.toString());
		System.out.println("");
		
		// PRINT SHAPE
		for (int i = 0; i < triangle[0]; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}		
			System.out.println();
		}

		System.out.println("");
	}

}
