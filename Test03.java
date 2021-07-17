package com.hp.dayzy;

import javax.swing.*;
import java.awt.*;

//作业3:  使用线程的sleep方法 做一个控制台显示时间 ,  格式是:  2021-07-17 23:45:动态的秒
//	时间是动态的...
public class Test03 extends JFrame implements Runnable {  //实现接口
        Thread clockThread;
        JLabel jLabel = new JLabel();

        public Test03() {
            Container con = this.getContentPane();
            con.add(new Drawtime());
        }

        public void start() {
            //该方法是类的方法，不是线程的方法
            if (clockThread == null) {
                clockThread = new Thread(this, "Clock");
                /*线程体是Clock对象本身，线程名字为"Clock"*/
                clockThread.start();//启动线程
            }
        }

        public void run() {//run()方法中是线程执行的内容
            while (clockThread != null) {
                repaint();//刷新显示画面
                try {
                    clockThread.sleep(1000);
                    //睡眠1秒，即每隔1秒执行一次
                } catch (InterruptedException e) {
                }
            }
        }
    //该方法是类的方法，不是线程的方法
        public void stop() {
            clockThread.stop();
            clockThread = null;
        }
    }

