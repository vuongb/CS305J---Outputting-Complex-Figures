import java.awt.*;
public class Drawing1
	{
	public static void main (String[] args)
	{
	DrawingPanel panel = new DrawingPanel(500, 500);	
	panel.setBackground(Color.white);
	Graphics g = panel.getGraphics();
	
	g.drawRect(50, 50, 75, 75);
	g.setColor(Color.green);
	g.fillRect(50, 50, 300, 300);
	g.drawOval(300, 300, 50, 50);
	g.setColor(Color.red);
	g.fillOval(75, 75, 250, 250);
	g.drawLine(200, 200, 150, 150);
	g.setColor(Color.black);
	g.drawLine(250, 250, 150, 150);
	g.setColor(Color.black);
	}
}

