package com.lsaiah.io;
import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File currentDir = new File("C:\\Users\\Administrator.PC-20190504PBOJ\\Documents");
        listDir(currentDir.getCanonicalFile(), 0);
    }

    public static String getSpace(int level) {
        String temp = "";
        for (int i = 0; i < level; i++) {
            temp += "   ";
        }
        return temp;
    }

    static void listDir(File dir, int dir_level) {
        //先把当前目录打印出来（根据传入的目录级别打印空格）
        System.out.println(getSpace(dir_level)+dir+"\\");
        //列出所有文件和子目录
        File[] fs = dir.listFiles();
        if (fs != null) {
            for (File f : fs) {
                //判断f，如果是文件，先打印文件
                if (f.isFile()) {
                    System.out.println(getSpace(dir_level+1)+f.getName());
                }else {
                    //如果是目录，继续递归执行
                    listDir(f,dir_level+1);
                }
            }
        }
    }
}
