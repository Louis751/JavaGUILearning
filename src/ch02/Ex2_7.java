package ch02;
/*
 * 解释如何绘制多边形*/

import java.awt.*;

public class Ex2_7 extends Frame implements Runnable{
		int[] pgx = {90,130,180,230,180,130,90};
		int[] pgy = {100,60,60,100,150,150,100};
		int pgn = 7;
		
		int[] fpgx = {90,130,180,230,180,130,90};
		int[] fpgy = {250,210,210,250,300,300,250};
		int fpgn = 7;
	public static void main(String[] args) {
		Ex2_7 workStart = new Ex2_7();
	}
	
	public Ex2_7(){
		super("Ex2_7");
		setSize(350,350);
		setVisible(true);
		
		new Thread(this).start();
	}
	
	public void run(){
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawPolygon(pgx,pgy,pgn);
		g.fillPolygon(fpgx,fpgy,fpgn);
	}

}
