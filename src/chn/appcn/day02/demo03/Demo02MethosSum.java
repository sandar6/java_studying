package chn.appcn.day02.demo03;

// 定义一个方法，用来求出1-100之间的数值和
public class Demo02MethosSum {
    public static void main(String[] args) {
        System.out.println("结果是："+getSum());
    }

    public static int getSum(){
        int result = 0;
        for(int i=1;i<=100;i++){
            result += i;
        }
        return result;
    }
}
