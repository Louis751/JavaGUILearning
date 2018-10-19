package ch04;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex4_4_1 extends Frame implements Runnable{
	int num = 0,flag,i;
	Image[] img;

	public static void main(String[] args) {
		Ex4_4_1 workStart = new Ex4_4_1();
		
		workStart.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});		// 关闭窗口
		
	}
	
	public Ex4_4_1(){
		super("Ex4_4_1");
		setSize(350,350);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = new Image[13];
		for(i = 0;i < img.length - 1;i++){
			img[i] = tk.getImage("杀破狼/"+ i + ".png");
		}
		
		setVisible(true);
		new Thread(this).start();
	}
	
	public void run(){
		while(true){
			flag = num % 10;
			repaint();
			num++;
			
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g){
		g.drawImage(img[flag], 50, 50, this);
	}

}
