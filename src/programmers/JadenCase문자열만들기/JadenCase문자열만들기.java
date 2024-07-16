package programmers.JadenCase문자열만들기;

import programmers.ReadData;

import javax.tools.JavaCompiler;
import java.util.List;

public class JadenCase문자열만들기 {
    public static void main(String[] args) {

        List<String> testCases = ReadData.INSTANCE.readFileContents("JadenCase문자열만들기");
        for(String tc : testCases) {
            System.out.println(solution(tc));
        }
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        boolean isFirst = true;
        for(Character c : s.toCharArray()){
            sb.append(isFirst ? Character.toUpperCase(c) : Character.toLowerCase(c));
            isFirst = c == ' ';
        }

        return sb.toString();
    }
}
