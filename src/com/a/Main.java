package com.a;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class A implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System .out.println("事件监听");
    }
}
class B extends WindowAdapter{//窗口监听器
    public void windowClosing(WindowEvent e){//窗口关闭事件
        System.exit(-1);
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Frame f=new Frame("事件监听");
        f.setLocation(100,100);
        f.setSize(300,300);
        f.setBackground(Color.blue);
        //f.pack();
        Button b=new Button("ojbk");
        b.setBackground(Color.orange);
        //b.setBounds(50,50,50,50);
        Button b2=new Button("hhhh");
        f.add(b2);
        f.add(b);
        A a=new A();
        b.addActionListener(a);
        b2.addActionListener(a);
        B b1=new B();
        f.addWindowListener(b1);
        f.setVisible(true);
    }
}
