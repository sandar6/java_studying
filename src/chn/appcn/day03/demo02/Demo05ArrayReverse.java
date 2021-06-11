package chn.appcn.day03.demo02;

/*
* 元素的反转：
* [1,2,3,4]
* [4,3,2,1]
*
* */

public class Demo05ArrayReverse {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3,33,11,9,-6,0};
//        int[] arrayB = new int[arrayA.length];
//        int num = arrayA.length-1;
//        int i = 0;
//        /*
//        * 43210
//        * 01234
//        * */
//        while (num>=0){
//            arrayB[i] = arrayA[num];
//            num--;
//            i++;
//        }
//        for (int k=0;k<arrayB.length;k++){
//            System.out.println(arrayB[k]);
//        }
        int x;
        if (arrayA.length%2==0){
            for (int i=0;i<arrayA.length/2;i++){
                x = arrayA[i];
                arrayA[i] = arrayA[arrayA.length-1-i];
                arrayA[arrayA.length-1-i] = x;
            }
        }else{
            for (int i=0;i<=arrayA.length/2-1;i++){
                x = arrayA[i];
                arrayA[i] = arrayA[arrayA.length-1-i];
                arrayA[arrayA.length-1-i] = x;
            }
        }
        for (int i=0;i< arrayA.length;i++){
            System.out.println(arrayA[i]);
        }

    }

}
