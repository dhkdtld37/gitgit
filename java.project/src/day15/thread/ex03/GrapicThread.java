package day15.thread.ex03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GrapicThread 
								extends JFrame implements Runnable { 
								// Frame " window
	int num, x, y;
	Color color;
	Random random;
	
	public GrapicThread(int num) {  // 생성자 함수 - 초기화
		this.num = num;
		color = Color.green;
		random = new Random();
		setSize(500, 400);  		// 프레임 화면 크기 - 너비, 높이
		setVisible(true);			// 화면 보여주기
		setLocation(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
//		g.fillRect(x, y, 3, 3);
		g.fillOval(x, y, 10, 10);
	}

	@Override
	public void run() {
		Rectangle rect = getBounds();
		
		for (int i = 0; i < num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			
			repaint();
			
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}  	// for end
	} 		// run end
}
