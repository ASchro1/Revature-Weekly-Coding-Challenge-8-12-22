import java.lang.Math;
public class MainDriver {
    public static int quadraticEquation(int a, int b, int c){
        return (int)Math.round(((-b/(2.0*a)) + (Math.sqrt((b*b) - (4*a*c))/(2*a))));
    }
    public static boolean isPerfect(int n){
        int multiples = 1;
        int sum = 0;
        while(multiples < n){
            if(n%multiples == 0){
                sum = sum + multiples;
            }
            multiples++;
        }
        return (sum == n);
    }
    public static void main(String[] args){
        System.out.println(quadraticEquation(1, 2, -3));
        System.out.println(quadraticEquation(2, -7, 3));
        System.out.println(quadraticEquation(1, -12, -28));
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(28));
        System.out.println(isPerfect(496));
        System.out.println(isPerfect(12));
        System.out.println(isPerfect(97));

    }
}
