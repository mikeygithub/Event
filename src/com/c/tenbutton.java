package com.c;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class CLOSE extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(-1);
    }
}
public class tenbutton {
    public static void main(String [] args){
        Frame f=new Frame("BUTTOMTEST");
        f.setLayout(new GridLayout(2,1));
        f.setLocation(750,300);
        f.setSize(400,400);

        Panel p1=new Panel();
        p1.setLayout(new BorderLayout());

        Panel p2=new Panel();
        p2.setLayout(new GridLayout(2,1));
        Button b1=new Button("button1");
        Button b2=new Button("button2");
        Button b3=new Button("button3");
        Button b4=new Button("button4");
        p1.add(b1,BorderLayout.WEST);
        p1.add(b2,BorderLayout.EAST);
        p2.add(b3);
        p2.add(b4);
        p1.add(p2,BorderLayout.CENTER);

        Panel p3=new Panel();
        Panel p4=new Panel();
        p3.setLayout(new BorderLayout());
        p4.setLayout(new GridLayout(2,2));
        p3.add(p4);
        Button b5=new Button("button5");
        Button b6=new Button("button6");
        Button b7=new Button("button7");
        Button b8=new Button("button8");
        Button b9=new Button("button9");
        Button b10=new Button("button10");
        p3.add(b5,BorderLayout.WEST);
        p3.add(b6,BorderLayout.EAST);
        p4.add(b7);p4.add(b8);p4.add(b9);p4.add(b10);
        f.add(p1);
        f.add(p3);
        f.pack();
        f.setVisible(true );
        f.addWindowListener(new CLOSE());
    }
}
