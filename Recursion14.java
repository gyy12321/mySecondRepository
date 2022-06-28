package 小练习;

public class Recursion14 {
    public static void main(String[] args) {
        System.out.println(mul(7));
    }
    public static int mulHelp(int a,int b){
        if(a==1)
            return b;
        else
            return mulHelp(a-1,b*a);
    }
    public static int mul(int i){
        return mulHelp(i,1);
    }
}
