package com.b;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class A extends WindowAdapter{//监听
    public void windowClosing(WindowEvent e) {
        System.exit(-1);
    }
}
public class Main01 {
    public static void main(String [] a){
    Frame f=new Frame("HELLO");
    f.setLocation(750,300);
    f.setSize(400,400);
    f.setBackground(Color.gray);
    f.setVisible(true );

    Panel p1=new Panel();
    p1.setSize(300,300);
    p1.setBackground(Color.BLACK);
    f.add(p1,BorderLayout.WEST);
    Button b1=new Button("button1");
    b1.setBackground(Color.CYAN);
    b1.setSize(200,200);
    b1.setLocation(300,300);
    p1.add(b1);

    Panel p2=new Panel();
    p2.setSize(300,300);
    p2.setBackground(Color.orange);
    f.add(p2,BorderLayout.EAST);
        Button b2=new Button("button1");
        b2.setBackground(Color.CYAN);
        b2.setSize(200,200);
        b2.setLocation(300,300);
        p2.add(b2);

    Panel p3=new Panel();
    p3.setSize(300,300);
    p3.setBackground(Color.green);
    f.add(p3,BorderLayout.CENTER);
        Button b3=new Button("button1");
        b3.setBackground(Color.CYAN);
        b3.setSize(200,200);
        b3.setLocation(300,300);
        p3.add(b3);

    f.addWindowListener(new A());//监听关闭窗口
    }
}
