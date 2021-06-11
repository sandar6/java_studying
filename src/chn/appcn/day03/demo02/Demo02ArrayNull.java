package chn.appcn.day03.demo02;

/*
* 只定义了数组，没有初始化数组，会出现空指针
*
*
* 解决方案：
* 加上new
*
*
* */

public class Demo02ArrayNull {
    public static void main(String[] args) {
        int [] array = null;
        array = new int[3];
        System.out.println(array[0]);
    }
}
