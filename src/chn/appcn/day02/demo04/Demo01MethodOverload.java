package chn.appcn.day02.demo04;

// 对于功能类似的方法，因为参数列表不一样
//方法的重载（overload）,方法名称一样，但是参数列表不一样




public class Demo01MethodOverload {
    public static void main(String[] args) {
//        System.out.println(sumTwo(2,3));
//        System.out.println(sumThree(3,4,5));

        System.out.println(sum(1,1));
        System.out.println(sum(1,1,3));

    }
//    public static int sumTwo(int a , int b){
//        return a + b;
//    }
//
//    public static int sumThree(int a , int b , int c){
//        return a + b + c;
//    }


    public static int sum(int a , int b){
        return a + b;
    }
    public static int sum(int a ,int b ,int c){
        return a + b + c;
    }

}
