package 小练习;

public class QiuHe8 {
    public static void main(String[] args) {
        String s="";
        int sum=0;
        for(int i=1;i<=9;i++){
            s=s+i;
            sum=sum+Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
