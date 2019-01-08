import Grid.*;

import java.io.IOException;

import Character.*;
import GameUtil.Vector2D;

public class Main 
{

	public static void main(String[] args) 
	{
		GridField field = new GridField(7,5); 
		//field.getPointByPosition(5, 3).print();
		//field.printField();
		GridPoint[] neighbours = field.getNeighbourPoints(3, 2);
		for(int n = 0; n < neighbours.length; n++)
		{
			//neighbours[n].print();
		}
		PlayerCharacter player = new PlayerCharacter(field);
		player.printPosition();
		player.moveRight();
		player.moveRight();
		player.moveRight();
		player.moveLeft();
		player.moveUp();
		player.moveUp();
		player.moveDown();
		player.printPosition();
		field.linkPoints();
		field.printField();
		System.out.println("0,0 -> 5,0 : " + Vector2D.Distance(field.getPointByPosition(0, 0), field.getPointByPosition(4, 2)));
		GridPoint lerpPointA = Vector2D.LerpPointOnGrid(field,field.getPointByPosition(4, 1), field.getPointByPosition(4, 4), 0.5f);
		lerpPointA.print();
		GridPoint lerpPointB = Vector2D.Lerp(field.getPointByPosition(4, 1), field.getPointByPosition(4, 4), 0.5f);
		lerpPointB.print();
	}

}
