package chn.appcn.day02.demo05;


/*
* 直接打印数组名，得到的数组对应的：内存地址的哈希值
*
*
* */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        int [] arrayA = {10,20,30};
        System.out.println(arrayA);
//        打印数组中单个的元素
        System.out.println(arrayA[1]);
        System.out.println("=======");

//        将数组中的单个元素赋值给变量
        int num = arrayA[1];
        System.out.println(num);
    }
}
