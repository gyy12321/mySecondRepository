package 小练习;

public class Number10001 {
    public static void main(String[] args) {
        int num=0;
        int n=1;
        while(num<10001){
            n++;
            if(isNumber(n))
                num++;
        }
        System.out.println(n);
    }
    private static boolean isNumber(int a){
        for (int i = 2; i <=(int)(Math.sqrt(a)); i++) {
            if(a%i==0)
                return false;
        }
        return true;
    }
}
