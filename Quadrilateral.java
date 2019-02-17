public class Quadrilateral extends PolyShape{

	private final static int FOUR = 4;
	
	// constructor
	public Quadrilateral(int numSides, int[] sideLengths)
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
	public String toString()
	{
		String s = super.toString();
		s += "\nI am a quadrilateral.";
		return s;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Quadrilateral)
		{
			Quadrilateral otherObject = (Quadrilateral) obj;
			return super.equals(obj)
				&& this.getSideLengths() == (otherObject.getSideLengths())
				&& this.getNumSides() == (otherObject.getNumSides());
		}
		else
		{
			return false;
		}
	}
}
