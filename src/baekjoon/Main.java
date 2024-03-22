package baekjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String input = args[0];
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String output = "";
        int i=0;

        String[] list = input.split(" ");
        output += checkLen(list[i++], 1) + " ";
        output += checkLen(list[i++], 1) + " ";
        output += checkLen(list[i++], 2) + " ";
        output += checkLen(list[i++], 2) + " ";
        output += checkLen(list[i++], 2) + " ";
        output += checkLen(list[i++], 8);

        System.out.println(output);
    }

    public static int checkLen(String lenStr, int require) {
        return require - Integer.parseInt(lenStr) ;
    }

}