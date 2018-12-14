package GameUtil;

import Grid.GridField;
import Grid.GridPoint;

public abstract class GameObject 
{
	public boolean initialized = false;
	public GridPoint position;
	public GridField parentGrid;
	
	public void moveRight()
	{
		GridPoint currentPosition = position;
		try
		{
			System.out.println("moving right...");
			GridPoint nextPosition = parentGrid.getPointByPosition(currentPosition.xCoord + 1, currentPosition.yCoord);
			if(nextPosition.passable == true)
			{
				this.position.occupant = null;
				this.position = nextPosition;
				nextPosition.occupant = this;
			}
			else
			{
				System.out.println("Can't move to " + nextPosition.xCoord + "/" + nextPosition.yCoord);
			}
		}
		catch(NullPointerException npe)
		{
			System.out.println("nextPosition out of bounds!");
		}

	}
	
	public void moveLeft()
	{
		GridPoint currentPosition = position;
		try
		{
			System.out.println("moving left...");
			GridPoint nextPosition = parentGrid.getPointByPosition(currentPosition.xCoord - 1, currentPosition.yCoord);
			if(nextPosition.passable == true)
			{
				this.position.occupant = null;
				this.position = nextPosition;
				nextPosition.occupant = this;
			}
			else
			{
				System.out.println("Can't move to " + nextPosition.xCoord + "/" + nextPosition.yCoord);
			}
		}
		catch(NullPointerException npe)
		{
			System.out.println("nextPosition out of bounds!");
		}
	}
	
	public void moveUp()
	{
		GridPoint currentPosition = position;
		try
		{
			System.out.println("moving up...");
			GridPoint nextPosition = parentGrid.getPointByPosition(currentPosition.xCoord, currentPosition.yCoord + 1);
			if(nextPosition.passable == true)
			{
				this.position.occupant = null;
				this.position = nextPosition;
				nextPosition.occupant = this;
			}
			else
			{
				System.out.println("Can't move to " + nextPosition.xCoord + "/" + nextPosition.yCoord);
			}
		}
		catch(NullPointerException npe)
		{
			System.out.println("nextPosition out of bounds!");
		}
	}
	
	public void moveDown()
	{
		GridPoint currentPosition = position;
		try
		{
			System.out.println("moving down...");
			GridPoint nextPosition = parentGrid.getPointByPosition(currentPosition.xCoord, currentPosition.yCoord - 1);
			if(nextPosition.passable == true)
			{
				this.position.occupant = null;
				this.position = nextPosition;
				nextPosition.occupant = this;
			}
			else
			{
				System.out.println("Can't move to " + nextPosition.xCoord + "/" + nextPosition.yCoord);
			}
		}
		catch(NullPointerException npe)
		{
			System.out.println("nextPosition out of bounds!");
		}
	}
	
	
	public void printPosition()
	{
		System.out.println(("PC{ " + "x:" + position.xCoord + " y:" + position.yCoord + " }" ));
	}
}
