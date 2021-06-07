package chn.appcn.day02.demo02;

/*
* 注意事项：
* 1.对于有返回值的：可以使用单独调用，打印调用和赋值调用
* 2.对于无返回值的:只能单独调用，不能打印调用和赋值调用，void
*
*
*
* */

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int sum = getSum(2,9);
//        有返回值的方法调用
        System.out.println("返回值是："+sum);
        System.out.println("=========");
//        无返回值的方法调用
        printSum(6,6);


    }
    public static int getSum(int a ,int b){
        int result = a + b;
        return result;
    }

    public static void printSum(int a,int b){
        int result = a + b;
        System.out.println("结果是："+result);
    }
}
