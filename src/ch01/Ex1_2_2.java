package ch01;
/*
 * ���ͼ̳�Frame���ʹ�÷���
 * */

import java.awt.*;

@SuppressWarnings("serial")
public class Ex1_2_2 extends Frame{		// super�̳и���Frame
	Font messageFont;

	public Ex1_2_2(){
		super("Ex1_2_2");
		setSize(350,350);
		setVisible(true);
	}
	
	public static void main(String[] args){
		@SuppressWarnings("unused")
		Ex1_2_2 workstart = new Ex1_2_2();
	}	
}
