package chn.appcn.day02.demo05;


/*
* 使用静态初始化数组的时候，格式可以省略一下
*
* 标准格式：
* 数据类型[] 数组名称 = new 数据类型[]{元素1，元素2}；
*
*
* 省略格式：
* 数据类型 [] 数组名称 = {元素1，元素2};
*
*
* 注意事项：
* 1.静态初始化没有直接指定长度，但是仍然会自动推算获得长度
* 2.静态初始化的标准格式可以拆分成两个部分
* 3.动态初始化也可以拆分成两个步骤
* */
public class Demo03Array {
    public static void main(String[] args) {
        int [] arrayA = {10,20,30};
//        静态初始化的标准格式可以拆分成两个步骤
        int [] arrayB;
        arrayB = new int[]{1,2,3};
//        动态初始化也可以拆分成两个步骤
        double [] arrayC;
        arrayC = new double[10];
    }
}
