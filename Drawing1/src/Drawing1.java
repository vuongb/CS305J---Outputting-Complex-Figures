import java.awt.*;
public class Drawing1
{
	public static void main (String[] args)
	{
	DrawingPanel panel = new DrawingPanel(400,200);
	panel.setBackground(Color.green);
	Graphics g = panel.getGraphics();
	g.drawOval(0,0,200,100);
	g.setColor(Color.red);
	g.fillOval(0,0,200,100);
	g.drawOval(200,100,200,100);
	g.setColor(Color.red);
	g.fillOval(200,100,200,100);
	g.setColor(Color.black);
	g.drawLine(200,0,200,200);
	g.drawLine(0,100,400,100);
	g.drawLine(100,0,100,100);
	g.drawLine(0,50,200,50);
	g.drawLine(300,100,300,200);
	g.drawLine(200,150,400,150);
	}
}
