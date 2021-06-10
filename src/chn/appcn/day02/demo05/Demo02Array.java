package chn.appcn.day02.demo05;


/*
* 动态初始化（指定长度）：在创建数组的时候，直接指定数组中的数据的个数
* 静态初始化（指定类容）：在创建数组的时候，不直接指定数据个数多少，而是将具体的数据类容指定
*
*
* 静态初始化的基本格式
* 数据类型[] 数组名称 = new 数据类型[] {元素1，元素2，...}
*
* */
public class Demo02Array {
    public static void main(String[] args) {
//        直接创建一个数组，里面包含全部都是int数字，5,15,25
        int [] arrayA = new int[]{5,15,25};
//        创建一个字符串数组，包含“java","python","PHP"
        String [] arrayB = new String[]{"java","python","PHP"};

    }
}
