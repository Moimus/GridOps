package Grid;

import GameUtil.GameObject;

public abstract class GridPoint 
{
	public float xCoord;
	public float yCoord;
	public boolean passable = true;
	public GameObject occupant = null;
	
	//Point order: NW, N, NE, E, W, SE, S, SW
	public GridPoint[] linkedPoints = new GridPoint[8];
	
	public void print()
	{
		System.out.println("Point{ x:" + xCoord + " y:" + yCoord + " Occupant: " + occupant + " }");
		for(int n = 0; n < linkedPoints.length; n++)
		{
			if(linkedPoints[n] != null)
			{
				System.out.println("	Link{ x:" + linkedPoints[n].xCoord + " y:" + linkedPoints[n].yCoord + " }");	
			}	
		}
	}

}
