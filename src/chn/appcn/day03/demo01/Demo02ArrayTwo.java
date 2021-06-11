package chn.appcn.day03.demo01;

public class Demo02ArrayTwo {
    public static void main(String[] args) {
        int [] arrayA = new int[3];
        System.out.println(arrayA);// 地址值
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]);// 0
        System.out.println(arrayA[2]);// 0
        System.out.println("========");

        //改变数组当中元素的内容
        arrayA[0] = 10;
        arrayA[1] = 20;
        System.out.println(arrayA);// 地址值
        System.out.println(arrayA[0]);// 10
        System.out.println(arrayA[1]);// 20
        System.out.println(arrayA[2]);// 0


        int [] arrayB = new int[3];
        System.out.println(arrayB);// 地址值
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]);// 0
        System.out.println(arrayB[2]);// 0
        System.out.println("========");

        //改变数组当中元素的内容
        arrayB[0] = 100;
        arrayB[1] = 200;
        System.out.println(arrayB);// 地址值
        System.out.println(arrayB[0]);// 100
        System.out.println(arrayB[1]);// 200
        System.out.println(arrayB[2]);// 0
    }
}
