package com.hp.dayzy;

import java.io.File;

/*
* 作业1:   遍历 你D盘 的 其中一个文件夹 , 并查找出 文件中带有 java 的 文件.
* */
public class Test01 {
    public static void main(String[] args) {
        File file=new File("D:\\Zuoye");
        long s=findAll(file);
    }
    public static long findAll(File file){
        File[] files=file.listFiles();

        for (File file1 : files) {
            //获取遍历后的文件名
           String s1=file1.getName();
           //查找出 文件中带有 java 的 文件
            boolean s2=s1.contains("java");

            if (file1.isDirectory()){
                    findAll(file1);  //调用自身 递归  如果有目录就接着调用
            }else{
                if (s2 == true) {
                    System.out.println("文件中带有java名字的：" + file1.getName());
                }
            }
        }
        return 0;
    }
}
