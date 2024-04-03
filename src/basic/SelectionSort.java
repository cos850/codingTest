package basic;


import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] testdata = {1, 3, 5, 9, 10, 4, 6, 8, 7, 2};
        int min, minOffset, temp;

        for(int i=0; i<testdata.length; i++) {
            min = testdata[i];
            minOffset = i;
            for(int j=i; j<testdata.length; j++) {
                if(min > testdata[j]) {
                    min = testdata[j];
                    minOffset = j;
                }
            }
            temp = testdata[i];
            testdata[i] = min;
            testdata[minOffset] = temp;
            System.out.println((i+1) + ". " + Arrays.toString(testdata));
        }

        System.out.println("정렬 완료: " + Arrays.toString(testdata));
    }

}
