package Lab03;
//Name______________________________ Date_____________
import java.awt.*;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;

public class Panel03 extends JPanel {
	private BufferedImage myImage;

	public Panel03()
      {
		 String input_string = JOptionPane.showInputDialog("The weight and height:", "400");
		 if(input_string == null) {
			 return;
		 }
         final int N = Integer.parseInt(input_string);
		 input_string = JOptionPane.showInputDialog("The number of line", "30");
		 if(input_string == null) {
			 return;
		 }
         final int LINE = Integer.parseInt(input_string);
         myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
         Graphics buffer = myImage.getGraphics();
      
      	//webbing
         buffer.setColor(Color.BLUE);
         buffer.fillRect(0, 0, N, N);
         buffer.setColor(Color.YELLOW);
         for(int k = 0; k <= LINE; k++)
         {
            buffer.drawLine(N * k / LINE, 0, N, N * k / LINE);
            buffer.drawLine(N, N * k / LINE, N - N * k / LINE, N);
            buffer.drawLine(N - N * k / LINE, N, 0, N - N * k /LINE);
            buffer.drawLine(0, N - N * k /LINE, N * k / LINE, 0);
         }
      
      	//sunshine
         int x = N / 2, y = N / 2; //center
         int x1, y1;							//endpoint for each ray
         double size = N / 4;					//length of each ray
         int r1 = (int) (N * 0.12), r2 = (int) (N * 0.11);			//radius of the sun
      
         for(int i = 0; i < 6; i++) {
        	 int DP_cos = (int) (size * Math.cos(2 * Math.PI / 12 * i)), DP_sin = (int) (size * Math.sin(2 * Math.PI / 12 * i));
        	 buffer.drawLine(x - DP_cos , y - DP_sin, x + DP_cos, y + DP_sin);
         }
         
         buffer.setColor(Color.BLUE.brighter());
         buffer.fillOval(x - r1, y - r1, r1 * 2, r1 * 2); 
         buffer.setColor(Color.YELLOW);
         buffer.fillOval(x - r2, y - r2, r2 * 2, r2 * 2);	
      }

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}
}