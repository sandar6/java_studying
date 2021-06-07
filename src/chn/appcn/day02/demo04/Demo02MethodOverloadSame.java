package chn.appcn.day02.demo04;


// 定义一个方法比较两个数据是否相等
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 20;
        byte b = 30;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short) 20,(short) 20));
        System.out.println(isSame(10,10));
        System.out.println(isSame(10L,20L));


    }

    public static boolean isSame(byte a , byte b){
        System.out.println("两个byte的方法执行！");
        boolean same;
        if (a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }

    public static  boolean isSame(short a , short b){
        System.out.println("两个short的方法执行！");
        boolean same = a == b ? true:false;
        return same;

    }

    public static boolean isSame(int a , int b){
        System.out.println("两个int的方法执行！");
        return  a == b;
    }

    public static boolean isSame(long a , long b){
        System.out.println("两个long的方法执行！");
        if (a == b){
            return true;
        }else {
            return false;
        }
    }
}
