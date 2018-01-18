import java.awt.*;
public class Drawing2
{
	public static void main (String[] args)
	{
		/* Create a drawing window of dimensions 550 pixels x 450 pixels and
		 * set the background color cyan*/
		DrawingPanel panel = new DrawingPanel(550,450);
		panel.setBackground(Color.cyan);
		Graphics g = panel.getGraphics();
		/* Draws box in top left corner starting from point (0,0) of
		 * dimensions (100 pixels x 100 pixels), with 1 sub-box, and 10 concentric circles*/
		singleBox(g, 0, 0, 100, 1, 10);
		/* Draws box in bottom right corner starting from point (12,155) of
		 * dimensions (30 pixels x 30 pixels), with 64 sub-boxes, and 5 concentric circles*/
		multipleBox(g, 12, 155, 30, 8, 5);
		/* Draws box in top right corner starting from point (305,10) of
		 * dimensions (48 pixels x 48 pixels), with 16 sub-boxes, and 6 concentric circles*/
		multipleBox(g, 305, 10, 48, 4, 6);
		/* Draws box in bottom left corner starting from point (300,225) of
		 * dimensions (70 pixels x 70 pixels), with 9 sub-boxes, and 7 concentric circles*/
		multipleBox(g, 300, 225, 70, 3, 7);
	}
	/* The method draws a single subfigure box with its associated concentric circle.
	 * x is the x origin coordinate
	 * y is the y origin coordinate
	 * size is the size of the box in pixels
	 * rowlumn is the number rows and columns
	 * circles is the amount of concentric circles */
	public static void singleBox (Graphics g, int x, int y, int size, int rowlumn, int circles)
	{
		//Draws rectangle and fills it green
		g.drawRect(x, y, size, size);
		g.setColor(Color.green);
		g.fillRect(x, y, size, size);
		/* Changes color back to black and draws a rectangle of same dimensions
		 * as rectangle drawn above to add black borders */
		g.setColor(Color.black);
		//Draw rectangle for black borders
		g.drawRect(x, y, size, size);
		/*Loop to draw concentric circles
		 * concentric circle information is determined by
		 * x coordinate is ((i*size)/(2*circles)) + x
		 * y coordinate is determined by ((i*size)/(2*circles)) + y
		 * width and height is determined by size - (size * i)/circles */
		for(int i=0; i<10; i++)
		{
			g.drawOval(((i*size)/(2*circles))+ x, ((i*size)/(2*circles))+ y, size - (size*i)/circles, size - (size*i)/circles);
		}
	}
	//Loop to draw boxes
	public static void multipleBox (Graphics g, int x, int y, int size, int rowlumn, int circles)
	{
		// Loop to draw columns
		for(int i=0; i<rowlumn; i++)
		{
			//Loop to draw rows
			for(int j=0; j<rowlumn; j++)
			{
				// Calls on singleBox to draw a single box and its respective concentric circle
				singleBox(g, x+(j*size), y+(i*size), size, rowlumn, circles);
			}
		}
	}
}
