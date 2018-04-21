package com.c;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class CLO extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e) {
        System .exit(-1);
    }
}
public class Main01 {
    public static void main(String [] args){
        Frame f=new Frame("测试");
        //f.setLayout(new GridLayout());
        f.addWindowListener(new CLO());
        f.setSize(500,500);
        f.setLocation(750,300);
        f.setVisible(true);
        f.addWindowListener(new CLO());

        Panel p1=new Panel();
        p1.setLayout(new BorderLayout());
        Button b1=new Button("button1");
        Button b2=new Button("button2");
        Button b3=new Button("button3");
        Button b4=new Button("button4");
        Button b5=new Button("button5");
        p1.add(b1,BorderLayout.NORTH);
        p1.add(b2,BorderLayout.SOUTH);
        p1.add(b3,BorderLayout.WEST);
        p1.add(b4,BorderLayout.EAST);
        p1.add(b5,BorderLayout .CENTER);

        Panel p2=new Panel();
        p2.setBackground(Color.blue);

        Panel p3=new Panel();
        p3.setLayout(new BorderLayout());
        Button b6=new Button("button1");
        Button b7=new Button("button2");
        Button b8=new Button("button3");
        Button b9=new Button("button4");
        Button b10=new Button("button5");
        p3.add(b6,BorderLayout.NORTH);
        p3.add(b7,BorderLayout.SOUTH);
        p3.add(b8,BorderLayout.WEST);
        p3.add(b9,BorderLayout.EAST);
        p3.add(b10,BorderLayout.CENTER);

        f.add(p1,BorderLayout.WEST);
        f.add(p2,BorderLayout.CENTER);
        f.add(p3,BorderLayout.EAST);
    }
}
