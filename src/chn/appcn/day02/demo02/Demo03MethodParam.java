package chn.appcn.day02.demo02;


/*
有参数：小括号当中有类容，当一个方法需要一些数据条件，才能完成任务，就是有参数
无参数：小括号留空
 */
public class Demo03MethodParam {

    public static void main(String[] args) {
        method1(2,5);
        method2();
    }
//    有参数
    public static void method1(int a,int b){
        int result = a * b;
        System.out.println("结果是："+result);
    }
//    无参数
    public static void method2(){
        for(int i=1;i<=10;i++){
            System.out.println("小姜你好"+i);
        }
    }
}
