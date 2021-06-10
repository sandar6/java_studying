package chn.appcn.day02.demo05;

/*
*数组的特点:
* 1.数组是一种引用型数据类型
* 2.数组当中的多个数据，类型必须统一
* 3.数组的长度在程序运行期间是不可变的
*
*
* 数组的初始化：在内存中创建一个数组，并且向其赋予一些默认值
*
* 两种常见的初始化方式：
* 1.动态初始化（指定长度）
* 2.静态初始化（指定类容）
*
*
* 动态初始化数组的格式
* 数据类型[] 数组名称 = new 数据类型[数组长度];
*
*
* */

public class Demo01Array {
    public static void main(String[] args) {
//        int score1 = 100;
//        int score2 = 97;
//        int score3 = 99;
//        创建一个数组，可以存放100个int类型的数据
        int [] arrayA = new int[100];
//        创建一个数组，存放10个double类型的数据
        double [] arrayB = new double[10];
//        创建一个数组，存放5个字符串
        String [] arrayC = new String[5];

    }
}
