public class Rectangle extends Quadrilateral{
	
	private final static int FOUR = 4;
	
	public Rectangle(int numSides, int[] sideLengths)
	{
		super(numSides, sideLengths);
	}
	
	@Override
	public void setNumSides(int numSides)
	{
		if (numSides == FOUR)
			super.setNumSides(FOUR);
	}	
	
	@Override
	public void setSideLengths(int[] sideLengths)
	{
		if (sideLengths[0] == sideLengths[1])
			super.setSideLengths(sideLengths);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Rectangle)
		{
			Rectangle otherObject = (Rectangle) obj;
			return super.equals(obj)
				&& this.getSideLengths() == (otherObject.getSideLengths())
				&& this.getNumSides() == (otherObject.getNumSides());
		}
		else
		{
			return false;
		}
	}
	
	// Area
	public int getArea()
	{
		return getSideLengths()[0] * getSideLengths()[2];
	}
	
	// Print shape
	/*public void printShape(int[] sideLengths)
	{
		for (int i = 0; i < sideLengths.length; i++)
		{
			System.out.println("*");
		}
		System.out.println();

	}*/
	
	@Override
	public String toString()
	{
		String s = "The area is: " + getArea() + "\n" + super.toString();
		s += "\nI am a rectangle.";
		return s;
	}
}
