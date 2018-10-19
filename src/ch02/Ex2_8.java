package ch02;
/*
 * 解释如何进行剪切*/

import java.awt.*;

public class Ex2_8 extends Frame implements Runnable{
	int[] pgx = {90,130,180,230,180,130,90};
	int[] pgy = {100,60,60,100,150,150,100};
	int pgn = 7;
	
	int[] fpgx = {90,130,180,230,180,130,90};
	int[] fpgy = {250,210,210,250,300,300,250};
	int fpgn = 7;
	public static void main(String[] args) {
		Ex2_8 workStart = new Ex2_8();
	}
	
	public Ex2_8(){
		super("Ex2_8");
		setSize(350,350);
		setVisible(true);
		
		new Thread(this).start();
	}
	
	public void run(){
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawRect(100, 80, 120, 50);
		g.drawPolygon(pgx,pgy,pgn);
		
		g.clipRect(100, 230, 120, 50);
		g.fillPolygon(fpgx,fpgy,fpgn);
	}

}
