package chn.appcn.day02.demo05;


/*
* 使用动态初始化数组的时候，其中的元素将会有一个默认值。规则如下：
* 如果是整数类型：默认为0
* 如果是浮点类型：默认为0.0
* 如果是字符类型：默认为'\u0000'
* 如果是布尔类型：默认为false
* 如果是引用类型：默认为null
*
*
* 注意事项：
* 静态初始化也有默认值的过程，只不过系统很快就把默认值替换成了大括号的值
*
* */
public class Demo05ArrayUse {
    public static void main(String[] args) {
//        动态初始化一个数组
        int [] arrayA = new int[3];
        System.out.println(arrayA);// 内存地址
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        System.out.println("========");
        arrayA[1] = 123; //将123赋值给数组arrayA的1好元素
        System.out.println(arrayA[0]);// 0
        System.out.println(arrayA[1]);// 123
        System.out.println(arrayA[2]);// 0
    }
}
