package chn.appcn.day03.demo01;

public class Demo01ArrayOne {
    public static void main(String[] args) {
        int [] array = new int[3];
        System.out.println(array);// 地址值
        System.out.println(array[0]); // 0
        System.out.println(array[1]);// 0
        System.out.println(array[2]);// 0
        System.out.println("========");

        //改变数组当中元素的内容
        array[0] = 10;
        array[1] = 20;
        System.out.println(array);// 地址值
        System.out.println(array[0]);// 10
        System.out.println(array[1]);// 20
        System.out.println(array[2]);// 0
    }
}
