package Grid;
import java.util.Random;

public class Rnd 
{
	//gets a point of a random type, coords are for dependency injection
	public static GridPoint getRandomPoint(int x, int y)
	{
		GridPoint result = null;
		Random rnd = new Random();
		int rndRoll = rnd.nextInt(2);
		//System.out.println(rndRoll);
		
		if(rndRoll == 0)
		{
			result = new BasicPoint(x,y);
		}
		else if(rndRoll == 1)
		{
			result = new BlockingPoint(x,y);
		}
		
		return result;
	}
}
