package GameUtil;

import Grid.BasicPoint;
import Grid.GridPoint;

public class Vector2D 
{
	public static float Distance(GridPoint A, GridPoint B)
	{
		float dist = -1;
		try
		{	
			float aX = A.xCoord;
			float aY = A.yCoord;
			
			float bX = B.xCoord;
			float bY = B.yCoord;
			
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
	
	//Linear Interpolation
	public static BasicPoint Lerp(GridPoint A, GridPoint B, float alpha)
	{
		//p1 + alpha * (p2 - p1)
		
		float interpolantX = A.xCoord + alpha * (B.xCoord - A.xCoord);
		float interpolantY = A.yCoord + alpha * (B.yCoord - A.yCoord);
		
		BasicPoint interpolant = new BasicPoint(interpolantX,interpolantY);
		return interpolant;
	}

}
