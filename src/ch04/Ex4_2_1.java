package ch04;
/*
 * ���Ͷ�����Ӧ�ã��ޱ߽�����*/

import java.awt.*;

public class Ex4_2_1 extends Frame implements Runnable{
	int x= 0,y = 160;
	int dx = 5,dy = 0;
	
	public static void main(String[] args) {
		Ex4_2_1 workStart = new Ex4_2_1();
	}
	
	public Ex4_2_1(){
		super("Ex4_2_1");
		setSize(350,350);
		setVisible(true);
		
		new Thread(this).start();
	}
	
	public void run(){
		while(true){
			x = x + dx;
			y = y + dy;
			repaint();
			
			try {
				Thread.sleep(50);	// �ȴ�250ms
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}		
	}
	
	public void paint(Graphics g){
		g.setColor(Color.GRAY);
		g.fillOval(x, y, 50, 50);
	}

}
