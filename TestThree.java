package com.hp.dayzy;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class TestThree {
    public static void main(String[] args){
        Test03 frame=new Test03();
        frame.setSize(500,300);
        frame.setVisible(true);                   //设置组件可见
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //关闭容口，并结束程序的运行
        frame.start();
        frame.run();
        frame.stop();
    }
}
class Drawtime extends JPanel{
    public void paint(Graphics g){
        g.setColor(Color.pink);
        Font font1=new Font("华文彩云",Font.ITALIC,60);
        g.setFont(font1);
        Date now=new Date();//获得当前的时间对象
        int m = now.getMonth() + 1;
        g.drawString(now.getYear()+1900+"-"+m+"-"+now.getDate()+"  "+now.getHours()+":"+now.getMinutes()+":"+now.getSeconds(),140,140);
//显示当前时间
    }
}
