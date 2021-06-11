package chn.appcn.day03.demo02;

import java.util.Arrays;

public class Demo04ArrayMax {
    public static void main(String[] args) {
        int max = arrayMax();
        System.out.println("最大值："+max);
    }
    public static int arrayMax(){
        int[] array = {1,11,2,234,15,22,33,6,-12,666};
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if ( max <= array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
