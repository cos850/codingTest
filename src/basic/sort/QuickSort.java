package basic.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 5, 7, 10, 9, 1, 3, 6, 8};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int start, int end){

        if(start >= end) {
            return;
        }

        // 1. 피벗 값 지정
        int pivot = array[start];
        int left = start + 1;
        int right = end;
        int temp;

        while(left <= right) {
            // 2-1. 피벗 다음 요소부터 오른쪽으로 이동하면서 피벗 값 보다 큰 값을 찾을 때까지 탐색
            while(left <= end && array[left] < pivot) { left++; }
            // 2-2. 오른쪽 요소부터 왼쪽으로 이동하면서 피벗 값 보다 작은 값이 있을 때까지 탐색
            while(right >= start && array[right] > pivot) { right--; }

            // 4. 왼쪽과 오른쪽의 인덱스가 서로 교차하게 되면, 왼쪽의 인덱스와 피벗 값 교체
            if(left >= right) {
                array[start] = array[right];
                array[right] = pivot;
            }

            // 3. 작은 값과 큰 값을 찾았으면 서로 자리 교체
            else {
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        // 5. 피벗을 기준으로 왼쪽과 오른쪽에서 다시 quickSort 반복
        quickSort(array, start, right-1);

        quickSort(array, right+1, end);

    }
}
