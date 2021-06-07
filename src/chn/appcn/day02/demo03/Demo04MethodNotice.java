package chn.appcn.day02.demo03;

/*
* 注意事项：
* 1.方法应该定义在类当中，不能在方法中再定义方法
* 2.方法的定义无所谓前后
* 3.方法定义完之后不会执行，如果希望执行，一定要调用：单独调用，打印调用，赋值调用
* 4.如果方法有返回值，必须写上return 返回值，不能没有
* 5.return后面的返回值数据，必须和方法的返回值类型对应起来
* 6.对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己
* 7.对于方法最后一行的return可以不写
* 8.一个方法中可以有多个return，但是同时保证只能有一个return会被执行，两个return不能连写
* */

public class Demo04MethodNotice {
    public static void main(String[] args) {
        System.out.println(method4(3,4));
    }
    public static int method1(){
        return (int)10.0;
    }

    public  static void method(){
        return;
//        错误的写法
//        return 10;
    }

    public static void method3(){
        System.out.println("aaa");
        System.out.println("bbb");
//        最后一行return可以不写
//        return;
    }

    public static int method4(int a ,int b){
//        int max;
//        if(a > b){
//            max = a;
//        }else{
//            max = b;
//        }
//        return max;

        if(a > b){
            return a;
        }else {
            return b;
        }
    }
}
