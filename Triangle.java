
public class Triangle extends PolyShape{

	private final static int TRIANGLE = 3;
	private boolean isIsoceles;
	private boolean isEquilateral;
	
	public Triangle(int numSides, int[] sideLengths, boolean isIsoceles, boolean isEquilateral)
	{
		super(numSides, sideLengths);
		this.isIsoceles = isIsoceles;
		this.isEquilateral = isEquilateral;
	}
	
	@Override
	public void setNumSides(int numSides)
	{
		if (numSides == TRIANGLE)
			super.setNumSides(TRIANGLE);
	}
	
	// ISOCELES
	public boolean isIsoceles()
	{
		return ((getSideLengths()[0] == getSideLengths()[1] && getSideLengths()[2] != getSideLengths()[0])
			|| (getSideLengths()[1] == getSideLengths()[2] && getSideLengths()[0] != getSideLengths()[1])
			|| (getSideLengths()[0] == getSideLengths()[2] && getSideLengths()[1] != getSideLengths()[0]));
	}	
	
	public void isIsoceles(boolean isIsoceles)
	{
		this.isIsoceles = isIsoceles;
	}
	
	// EQUILATERAL
	public boolean isEquilateral()
	{
		return ((getSideLengths()[0] == getSideLengths()[1] && getSideLengths()[2] == getSideLengths()[0])
			&& (getSideLengths()[1] == getSideLengths()[2] && getSideLengths()[0] == getSideLengths()[1])
			&& (getSideLengths()[0] == getSideLengths()[2] && getSideLengths()[1] == getSideLengths()[0]));
	}
	
	public void isEquilateral(boolean isEquilateral)
	{
		this.isEquilateral = isEquilateral;
	}
	
	@Override
	public String toString()
	{
		String s = "Is it isoceles? " + isIsoceles() + "\n" 
				+ "Is it equilateral? " + isEquilateral() + "\n" + super.toString();
		s += "\nI am a triangle.";
		return s;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Triangle)
		{
			Triangle otherObject = (Triangle) obj;
			return super.equals(obj)
				&& this.getSideLengths() == (otherObject.getSideLengths())
				&& this.getNumSides() == (otherObject.getNumSides())
				&& this.isEquilateral == otherObject.isEquilateral
				&& this.isIsoceles == otherObject.isIsoceles;
		}
		else
		{
			return false;
		}
	}

}
