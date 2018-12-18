package Grid;

public class BlockingPoint extends GridPoint 
{
	public BlockingPoint(float XCoord, float YCoord)
	{
		this.xCoord = XCoord;
		this.yCoord = YCoord;
		this.passable = false;
	}

}
