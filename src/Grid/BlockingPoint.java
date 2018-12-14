package Grid;

public class BlockingPoint extends GridPoint 
{
	public BlockingPoint(int XCoord, int YCoord)
	{
		this.xCoord = XCoord;
		this.yCoord = YCoord;
		this.passable = false;
	}

}
