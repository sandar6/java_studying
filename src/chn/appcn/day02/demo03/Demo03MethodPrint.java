package chn.appcn.day02.demo03;


// 定义一个方法：用来打印指定次数的Hello,world
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(110);
    }
    public static void printCount(int num){
        for (int i =1;i<=num;i++){
            System.out.println("第"+i+"次打印hello,world!");
        }
    }
}
