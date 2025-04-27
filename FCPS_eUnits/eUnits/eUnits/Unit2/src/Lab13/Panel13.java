package Lab13;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

public class Panel13 extends JPanel {
	private Timer t;
	private int stickmanX; // 火柴人的x座標
	private final int GROUND_HEIGHT = 200; // 地板高度
	private final int TARGET_X;
	private final int PANEL_WIDTH = 700;
	private final int PANEL_HEIGHT = 500;
	private BufferedImage image;
	private int showDialog = 0; 

	public Panel13() {
		try {
			image = ImageIO.read(new File("src/Lab13/tj.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		stickmanX = 0; // 從最左邊開始
		TARGET_X = PANEL_WIDTH / 6; // 設定目標點
		setBackground(Color.WHITE);
		t = new Timer(10, new Listener());
		t.start();

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// 將 Graphics 轉換為 Graphics2D
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.GRAY);
		g2d.fillRect(0, 0, PANEL_WIDTH, PANEL_HEIGHT);

		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, PANEL_HEIGHT - GROUND_HEIGHT, PANEL_WIDTH, GROUND_HEIGHT);

		g2d.setStroke(new BasicStroke(8));
		drawStickman(g2d);

		if (stickmanX < TARGET_X) {
			stickmanX += 2;
		} else if (showDialog == 0) {
			drawDialogBox1(g2d);
			showDialog ++;
			repaint();
		}else if(showDialog == 1) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			drawDialogBox1(g2d);
			drawDialogBox2(g2d);
		}
	}

	private void drawStickman(Graphics2D g2d) {
		g2d.setColor(Color.BLACK);

		int stickmanWidth = 150; // 火柴人寬度
		int stickmanHeight = 200; // 火柴人高度
		int headRadius = stickmanWidth / 3; // 頭部的半徑，與寬度成比例
		int centerY = PANEL_HEIGHT - GROUND_HEIGHT - 60; // 火柴人的身體中心點高度（在地板上方）
		g2d.drawImage(image, stickmanX + (stickmanWidth / 2 - headRadius), centerY - 200, 2 * headRadius,
				2 * headRadius, this);
		g2d.drawLine(stickmanX + stickmanWidth / 2, centerY - stickmanHeight / 2, stickmanX + stickmanWidth / 2,
				centerY);
		g2d.drawLine(stickmanX + stickmanWidth / 2, centerY - stickmanHeight / 2 + 20,
				stickmanX + stickmanWidth / 2 - 50, centerY - stickmanHeight / 4);
		g2d.drawLine(stickmanX + stickmanWidth / 2, centerY - stickmanHeight / 2 + 20,
				stickmanX + stickmanWidth / 2 + 50, centerY - stickmanHeight / 4);
		g2d.drawLine(stickmanX + stickmanWidth / 2, centerY, stickmanX + stickmanWidth / 2 - 50, centerY + 60);
		g2d.drawLine(stickmanX + stickmanWidth / 2, centerY, stickmanX + stickmanWidth / 2 + 50, centerY + 60);
	}

	private void drawDialogBox1(Graphics2D g2d) {
		g2d.setColor(Color.GRAY);
		g2d.fillOval(stickmanX + 180, PANEL_HEIGHT - GROUND_HEIGHT - 220, 400, 100); // 第一個對話框（橢圓）
		g2d.setColor(Color.BLACK);
		g2d.drawOval(stickmanX + 180, PANEL_HEIGHT - GROUND_HEIGHT - 220, 400, 100); // 第一個對話框邊框
		g2d.setFont(new Font("SimSun", Font.PLAIN, 24)); // 設置文字大小
		g2d.drawString("颱風天要帶多少錢出門", stickmanX + 190, PANEL_HEIGHT - GROUND_HEIGHT - 160); // 文字位置
	}

	private void drawDialogBox2(Graphics2D g2d) {
		g2d.setColor(Color.GRAY);
		g2d.fillOval(stickmanX + 180, PANEL_HEIGHT - GROUND_HEIGHT - 120, 400, 100); // 第二個對話框（橢圓）
		g2d.setColor(Color.BLACK);
		g2d.drawOval(stickmanX + 180, PANEL_HEIGHT - GROUND_HEIGHT - 120, 400, 100); // 第二個對話框邊框
		g2d.drawString("四千萬，因為...\"沒事千萬\"別出門", stickmanX + 190, PANEL_HEIGHT - GROUND_HEIGHT - 60); // 文字位置
	}

	public class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
}
