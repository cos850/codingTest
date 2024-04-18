package basic.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int temp;

        for(int i=1; i<array.length; i++) {
            int j = i;
            while(j>0 && array[j-1] > array[j]) {
                temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;

                j--;
            }
            // 정렬 과정 출력
            System.out.println(Arrays.toString(Arrays.copyOfRange(array, 0, i+1)));
        }
        // 정렬 완료 결과 출력
        System.out.println("정렬 완료: " + Arrays.toString(array));
    }
}
