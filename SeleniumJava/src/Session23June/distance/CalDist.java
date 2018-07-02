package Session23June.distance;

public class CalDist {

	public static double Distance(Point P1, Point P2)//?
	{

		double dist = Math.sqrt((P2.x - P1.x) * (P2.x - P1.x)) + ((P2.y - P1.y) * (P2.y - P1.y));
		
		return dist;

	}
	
	

}
