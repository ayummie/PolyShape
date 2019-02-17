public class Square extends Rectangle{

	private final static int FOUR = 4;
	
	public Square(int numSides, int[] sideLengths)
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
		if (sideLengths[0] == sideLengths[2])
			super.setSideLengths(sideLengths);
	}
	
	// Area
	public int getArea()
	{
		return getSideLengths()[0] * getSideLengths()[0];
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Square)
		{
			Square otherObject = (Square) obj;
			return super.equals(obj)
				&& this.getSideLengths() == (otherObject.getSideLengths())
				&& this.getNumSides() == (otherObject.getNumSides());
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		String s = super.toString();
		s += "\nI am a square.";
		return s;
	}
}
