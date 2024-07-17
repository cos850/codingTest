package programmers.최솟값만들기;

import programmers.ReadData;

import java.util.Arrays;
import java.util.List;

public class 최솟값만들기 {
    public static void main(String[] args) {
        List<String> testCases = ReadData.INSTANCE.readFileContents("최솟값만들기");
        for(String tc : testCases) {
            String[] inputs = tc.split("\t");
            int[] array1 = toIntArray(inputs[0]);
            int[] array2 = toIntArray(inputs[1]);

            System.out.println(solution(array1, array2));
        }
    }

    public static int[] toIntArray(String arrayStr) {
        return Arrays.stream(arrayStr.split(", "))
                .mapToInt(s -> Integer.parseInt(s.replaceAll("\\[|\\]", "")))
                .toArray();
    }

    public static int solution(int[] A, int[] B)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;

        for(int i = 0; i < A.length; i++){
            sum += A[i] * B[A.length - i - 1];
        }

        return sum;
    }
}
