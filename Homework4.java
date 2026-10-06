public class Homework4 {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("두 수를 입력하세요 : ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if(num1>=num2)
            result = Calculation.gcd(num1,num2);
        else
            result = Calculation.gcd(num2,num1);

        System.out.printf("두 수의 최대공약수는 %d입니다.", result);
    }
}

class Calculation{
    static int gcd(int m, int n){
        int max = 0;
        if(n == 0){return m;}
        if(m == n){return m;}

        for(int i = n; i > 0; i--){
            if(m % i == 0 && n % i == 0){
                max = i;
                break;
            }
        }
        return max;
    }
}
