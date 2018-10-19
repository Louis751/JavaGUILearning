package ch01;
/*
 * 解释窗口框架的创建
 * */

import java.awt.*;

public class Ex1_2_1 {
	public Ex1_2_1(){
		Frame f = new Frame("Ex1_2_1");
		f.setSize(350,350);
		f.setVisible(true);
	}
	
	public static void main(String[] args){
		@SuppressWarnings("unused")
		Ex1_2_1 workstart = new Ex1_2_1();
	}
}
