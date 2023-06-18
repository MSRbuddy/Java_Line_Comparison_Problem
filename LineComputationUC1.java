public class LineComputationUC1
{
	public static void main(String[] args) 
	{
		// point 1
		double x1 = 1;
		double y1 = 2;

		// point 2
		double x2 = 3;
		double y2 = 4;

		double length;

		// Calculate distance between two points
		length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)* (y2 - y1));
		System.out.println("length of a line :" + length);
	}
}