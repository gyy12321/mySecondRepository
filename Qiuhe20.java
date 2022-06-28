package 小练习;

import java.util.Scanner;

public class Qiuhe20 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1=in.nextInt();
        int input2=in.nextInt();
        int sum=0;
        for (int i = 0; i < input2; i++) {
            sum=sum+generateNumbers(input1, i+1);
        }
        System.out.println(sum);
    }
    public static int generateNumbers(int a,int n){
        String s="";
        for (int i = 0; i < n; i++) {
            s+=a;
        }
        return Integer.parseInt(s);
    }

}
