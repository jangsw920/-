public class Homework4 {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("두 수를 입력하세요 : ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.printf("두 수의 최대공약수는 %d입니다.", gcd(num1,num2));
    }

    int gcd(int m,int n){
        if(n == 0){return m;}

        if(m > n){return gcd(n,m%n);}
        else{return gcd(m,n%m);}
    }
}
