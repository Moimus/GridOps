package Character;

import GameUtil.GameObject;
import Grid.GridField;

public class PlayerCharacter extends GameObject
{
	public PlayerCharacter(GridField Parent)
	{
		this.parentGrid = Parent;
		this.position = this.parentGrid.getPointByPosition(0, 0);
	}
}
