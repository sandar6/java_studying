package chn.appcn.day03.demo02;

/*
*
* 如何获取数组的长度：
* 数组名称.lenght
* 将会得到一个int数字，代表数组的长度
*
*
* 数组一旦创建，程序运行期间，长度不可变
*
* */

public class Demo03ArrayLength {

    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10,20,30};
        System.out.println("arrayB数组的长度是："+arrayB.length);
        System.out.println("==========");

        int[] arrayC = new int[3];
        System.out.println(arrayC);
        System.out.println(arrayC.length);

        arrayC = new int[5];
        System.out.println(arrayC);
        System.out.println(arrayC.length);


        int[] arrayD = {10,22,10,222,31};
        for(int i=0;i<arrayD.length;i++){
            System.out.println(arrayD[i]);
        }
    }
}
