package ch07;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

public class Ex7_4_1 extends Frame implements Runnable{
        int x = 50, y = 100;
        int dx = 0, dy = 0;
        Image img;

    public static void main(String[] args){
        Ex7_4_1 workStart = new Ex7_4_1();
    }

    public Ex7_4_1(){
        super("Ex7_4_1");
        setSize(350, 350);

        Toolkit tk = Toolkit.getDefaultToolkit();
        img = tk.getImage("图形与网络游戏开发\\战斗机.png");

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
        if(e.getID() == KeyEvent.KEY_PRESSED){
            switch (e.getKeyCode()){
                case KeyEvent.VK_RIGHT:
                    dx = 5; dy = 0;
                    break;
                case KeyEvent.VK_LEFT:
                    dx = -5; dy = 0;
                    break;
                case KeyEvent.VK_UP:
                    dx = 0; dy = -5;
                    break;
                case KeyEvent.VK_DOWN:
                    dx = 0; dy = 5;
                    break;
            }
        }
    }

    @Override
    public void run() {
        while(true){

            repaint();
            System.out.println(dx+","+dy);
            if(x <= 0)  dx = 5;
            else if((x + img.getWidth(null)) >= this.getWidth()) dx = -5;
            if(y <= 0)  dx = 5;
            else if((y + img.getHeight(null)) >= this.getHeight()) dy = -5;
            x = x + dx;
            y = y + dx;
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g){
        g.drawImage(img, x, y, this);
    }
}
