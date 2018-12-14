package GameUtil;

import Grid.GridPoint;

public class Vector2D 
{
	public static float Distance(GridPoint A, GridPoint B)
	{
		float dist = -1;
		try
		{	
			int aX = A.xCoord;
			int aY = A.yCoord;
			
			int bX = B.xCoord;
			int bY = B.yCoord;
			
			// D = sqrt((xb - xa)^2 + (yb - ya)^2)
			
			float dX = ((float)bX - (float)aX) * ((float)bX - (float)aX);
			float dY = ((float)bY - (float)aY) * ((float)bY - (float)aY);
			float dXY = dX + dY;
			
			dist = (float)Math.sqrt((double)dXY);	
		}
		catch(NullPointerException ne)
		{
			System.out.println("Point out of range");
		}
		
		return dist;
	}
	
	public static void Lerp(GridPoint A, GridPoint B, float segment)
	{
		//TODO
	}

}
