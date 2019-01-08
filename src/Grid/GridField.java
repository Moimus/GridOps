package Grid;

import java.util.ArrayList;

public class GridField 
{
	public GridPoint[] field;
	
	public GridField(int sizeX, int sizeY)
	{
		//this.field = generateField(sizeX, sizeY);
		this.field = generateMockField();
		//linkPoints(this.field);
	}
	
	public GridPoint[] generateField(int xSize, int ySize)
	{ 
		ArrayList<GridPoint> field = new ArrayList<GridPoint>();
		for(int xn = 0; xn < xSize; xn++)
		{
			GridPoint pointX = Rnd.getRandomPoint(xn,0);
			field.add(pointX);
			
			for(int yn = 1; yn < ySize; yn++)
			{
				GridPoint pointY = Rnd.getRandomPoint(xn,yn);
				field.add(pointY);
			}
		}
		GridPoint[] fieldArray = new GridPoint[field.size()];
		fieldArray = field.toArray(fieldArray);
		return fieldArray;
	}
	
	public GridPoint[] generateMockField()
	{
		GridPoint[] mockField = new GridPoint[]
		{
			//X0
			new BasicPoint(0,0),
			new BasicPoint(0,1),
			new BasicPoint(0,2),
			new BlockingPoint(0,3),
			new BlockingPoint(0,4),
			//X1
			new BasicPoint(1,0),
			new BasicPoint(1,1),
			new BlockingPoint(1,2),
			new BasicPoint(1,3),
			new BlockingPoint(1,4),
			//X2
			new BasicPoint(2,0),
			new BasicPoint(2,1),
			new BasicPoint(2,2),
			new BlockingPoint(2,3),
			new BasicPoint(2,4),
			//X3
			new BasicPoint(3,0),
			new BlockingPoint(3,1),
			new BasicPoint(3,2),
			new BlockingPoint(3,3),
			new BasicPoint(3,4),
			//X4
			new BasicPoint(4,0),
			new BlockingPoint(4,1),
			new BlockingPoint(4,2),
			new BlockingPoint(4,3),
			new BlockingPoint(4,4),
			//X5
			new BasicPoint(5,0),
			new BlockingPoint(5,1),
			new BlockingPoint(5,2),
			new BasicPoint(5,3),
			new BasicPoint(5,4),
			//X6
			new BlockingPoint(6,0),
			new BlockingPoint(6,1),
			new BasicPoint(6,2),
			new BlockingPoint(6,3),
			new BlockingPoint(6,4),
						
		};
		
		return mockField;
	}
	
	public GridPoint getPointByPosition(float xCoord, float yCoord)
	{
		GridPoint result = null;
		
		for(int n = 0; n < field.length; n++)
		{
			if(field[n].xCoord == xCoord && field[n].yCoord == yCoord)
			{
				result = field[n];
			}
		}
		
		return result;
	}
	
	public GridPoint[] getNeighbourPoints(float xCoord, float yCoord)
	{
		GridPoint rootPos = this.getPointByPosition(xCoord, yCoord);
		GridPoint[] neighbours = new GridPoint[]
		{
				this.getPointByPosition(xCoord - 1, yCoord - 1), // NW point
				this.getPointByPosition(xCoord, yCoord - 1), //N point
				this.getPointByPosition(xCoord + 1, yCoord - 1), //NE point
				this.getPointByPosition(xCoord - 1, yCoord), //E point
				this.getPointByPosition(xCoord + 1, yCoord), //W point
				this.getPointByPosition(xCoord - 1, yCoord + 1), //SE point
				this.getPointByPosition(xCoord, yCoord + 1), //S point
				this.getPointByPosition(xCoord + 1, yCoord + 1) //SW point
				
		};
		
		return neighbours;
	}
	
	public void linkPoints() //TODO
	{
		field = this.field;
		for(int n = 0; n < field.length; n++)
		{
			if(field[n].passable == true)
			{
				GridPoint[] allNeighbours = getNeighbourPoints(field[n].xCoord, field[n].yCoord);
				for(int i = 0; i < allNeighbours.length; i++)
				{
					if(allNeighbours[i] != null && allNeighbours[i].passable == true)
					{
						field[n].linkedPoints[i] = allNeighbours[i];
					}
					else if(allNeighbours[i] != null)
					{
						field[n].linkedPoints[i] = null;	
					}
				}	
			}
		}
	}
	
	public void printField()
	{
		for(int n = 0; n < field.length; n++)
		{
			System.out.println(field[n].getClass().toString() + ": {" + field[n].xCoord + "/" + field[n].yCoord + " Occupant: " + field[n].occupant + "}");
			for(int i = 0; i < field[n].linkedPoints.length; i++)
			{
				if(field[n].linkedPoints[i] != null)
				{
					System.out.println("Links: " + field[n].linkedPoints[i].xCoord + "/" + field[n].linkedPoints[i].yCoord);	
				}	
			}

		}
	}
}
