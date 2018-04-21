package com.c;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*class CLO extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System .exit(-1);
    }
}*/
public class Main02 {
    public static void main(String [] args){
        Frame f=new Frame("测试");
        //f.setLayout(new GridLayout());
        f.addWindowListener(new CLO());
        f.setSize(500,500);
        f.setLocation(750,300);
        f.setVisible(true);
        f.addWindowListener(new CLO());
        f.setLayout(new GridLayout());
}
}
