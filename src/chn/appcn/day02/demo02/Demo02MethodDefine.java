package chn.appcn.day02.demo02;

// 定义一个两个数字相加的方法
public class Demo02MethodDefine {
    public static void main(String[] args) {
        int result = sum(2,3);
        System.out.println(result);
    }

    public static int sum(int a,int b){
        int result = a + b;
        return result;
    }
}
