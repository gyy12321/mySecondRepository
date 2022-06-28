package 小练习;

public class ShuiXianHua2 {
    public static void main(String[] args) {
        int a,b,c;//a,b,c代表百位十位个位
        for (int i = 100; i < 1000; i++) {
            a=i/100;
            b=(i-a*100)/10;
            c=i%10;
            if(i==a*a*a+b*b*b+c*c*c)
                System.out.print(i+" ");
        }

    }
}
