public class ReverseInteger {
    public static int reverse(int x){
        int temp = 0;
        boolean negative = false;
        if (x < 0){
            negative = true;
            x *= -1;
        }
        while (x > 0){
            int a = x%10;
            x = x/10;

            if (temp > Integer.MAX_VALUE / 10 || (temp == Integer.MAX_VALUE / 10 && a > 7)) {
                return 0;
            }
            if (temp < Integer.MIN_VALUE / 10 || (temp == Integer.MIN_VALUE / 10 && a < -8)) {
                return 0;
            }

            temp = (temp*10)+a;
        }
        if (negative){
            temp *= -1;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
