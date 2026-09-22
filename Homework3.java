import java.util.Scanner;

public class Homework3 {

    public static void main(){
        Scanner sc = new Scanner(System.in);

        int n;
        int min, max;
        int number[];
        min = 0;
        max = 0;

        System.out.print("몇 개의 정수를 입력받으실건가요?");
        n = sc.nextInt();

        number = new int[n];

        System.out.print("수를 입력하세요");

        for (int i =0; i < n; i++){
            number[i] = sc.nextInt();
            if(i == 0){
                min = number[i];
                max = number[i];
            }
            else {
                if (number[i] < min) {
                    min = number[i];
                }
                if (max < number[i]) {
                    max = number[i];
                }
            }

        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }

}
