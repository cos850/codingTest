package basic.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] testdata = {1, 3, 5, 9, 10, 4, 6, 8, 7, 2};
        int temp;
        for(int i=0; i<testdata.length; i++){
            for(int j=i; j>0; j--) {
                if(testdata[j] < testdata[j-1]) {
                    temp = testdata[j-1];
                    testdata[j-1] = testdata[j];
                    testdata[j] = temp;
//                    System.out.println("자리교체: " + testdata[j] + " <-> " + testdata[j-1]);
                } else {
                    break;
                }
            }
            System.out.println((i+1) + ". " + Arrays.toString(testdata));
        }
        System.out.println("정렬 완료: " + Arrays.toString(testdata));
    }

}
