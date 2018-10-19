package ch07;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

public class Ex7_5 extends Frame implements Runnable{
	int x = 200, y = 400, dx, dy;
	int bx, by, dbx = 0, dby = -5, bflag = 0;
	Image img,bufferPage=null;
	int imgWidth, imgHeight;
	
	public static void main(String[] args) {
		Ex7_5 workStart = new Ex7_5();		// 执行一次，不重画
	}
	
	public Ex7_5(){
		super("Ex7_5");
		setSize(500, 500);	// 1
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("战斗机.png");
		
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		enableEvents(AWTEvent.KEY_EVENT_MASK);
		
		setVisible(true);
		new Thread(this).start();
	}
	
	public void processWindowEvent(WindowEvent e){
		if(e.getID() == WindowEvent.WINDOW_CLOSING){
			System.exit(0);
		}
	}
	
	public void processKeyEvent(KeyEvent e){
		int MoveSpeed = 10;		// 只要发生按键事件就执行
		switch(e.getKeyCode()){
		case KeyEvent.VK_RIGHT:
			dx = MoveSpeed; dy = 0;		// 按下1次Right键并释放，执行2次
			break;
		case KeyEvent.VK_LEFT:
			dx = -MoveSpeed; dy = 0;
			break;
		case KeyEvent.VK_UP:
			dx = 0; dy = -MoveSpeed;
			break;
		case KeyEvent.VK_DOWN:
			dx = 0; dy = MoveSpeed;
			break;
		case KeyEvent.VK_SPACE:			
			dx = 0; dy = 0;
			bx = x + 35;
			by = y - 15;
			bflag = 1;
			break;
		default:
			dx = 0; dy = 0;
			break;
		}
		x = x + dx;
		y = y + dy;
	}

	@Override
	public void run() {
		while(true){
			if(by <= 0)	bflag = 0;
			if(bflag == 1)	by = by + dby;
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			repaint();
		}
	}
	
	public void update(Graphics g){
		paint(g);
	}
	
	public void paint(Graphics g){
		
		Graphics bufferg;
		if(bufferPage == null){
			bufferPage = createImage(350,350);
			bufferg = bufferPage.getGraphics();
			
			bufferg.drawImage(img, x, y, this);
			
			bufferg.dispose();g.drawImage(bufferPage,getInsets().left, getInsets().top, this);
		}
		// 战斗机
		imgWidth = img.getWidth(null);
		imgHeight = img.getHeight(null);
		g.drawImage(img, x, y, this);
		//System.out.println(imgWidth+","+imgHeight);
		// 子弹
		g.drawString("*", bx, by+5);
		g.fillRect(bx, by, 3, 5);
		g.fillRect(bx, by+6, 3, 5);
	}

}
