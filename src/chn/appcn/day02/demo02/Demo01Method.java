package chn.appcn.day02.demo02;

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }
    public static void printMethod(){
        for (int i = 0; i < 8; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
