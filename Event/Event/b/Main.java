package com.b;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AA extends WindowAdapter{
    public void windowClosing(WindowEvent e) {
    //public void windowListener(WindowEvent e){
        System.exit(-1);
    }
}
class B implements ActionListener
{
    //public void actionPerformed(ActionEvent e);
    public void actionPerformed(ActionEvent e){
        System .out.println("TESTFRAME");
    }
}

public class Main {
    public static void main(String [] args){
        Frame f=new Frame("TestFrame");
        f.setBackground(Color.blue);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        Button b1=new Button("button A");
        Button b2=new Button("button B");
        f.add(b1);f.add(b2);
        f.addWindowListener(new AA());
        b1.addActionListener(new B());
        b2.addActionListener(new B());
    }
}
