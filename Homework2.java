import java.util.Scanner;

public class Homework2 {
    Scanner sc = new Scanner(System.in);
    public void main(){
        int num[];
        String name [], major[];
        int phone[];

        num = new int[3];
        name = new String[3];
        major = new String[3];
        phone = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요 : ");
            num[i] = sc.nextInt();
            String n = sc.next();
            name[i] = n;
            String m = sc.next();
            major[i] = m;
            phone[i] = sc.nextInt();
        }
        student s1 = new student(num[0], name[0], major[0], phone[0]);
        student s2 = new student(num[1], name[1], major[1], phone[1]);
        student s3 = new student(num[2], name[2], major[2], phone[2]);

        System.out.println("입력된 학생의 정보는 다음과 같습니다.");
        System.out.printf("첫번째 학생 : %s %s %s %s", s1.getNum(), s1.getName(), s1.getMajor(), s1.getPHONE());
        System.out.println("\n");
        System.out.printf("두번째 학생 : %s %s %s %s", s2.getNum(), s2.getName(), s2.getMajor(), s2.getPHONE());
        System.out.println("\n");
        System.out.printf("세번째 학생 : %s %s %s %s", s3.getNum(), s3.getName(), s3.getMajor(), s3.getPHONE());
    }
}

class student{
    int num;
    String name;
    String major;
    int phone;
    String cn;
    String call;
    String call1;
    String call2;
    String call3;
    String PHONE;
    student(int num, String name, String major, int phone){
        this.num = num;
        this.name = name;
        this.major = major;
        this.phone = phone;
        cn = Integer.toString(num);
        call = Integer.toString(phone);
        call1 = "0"+call.substring(0,2);
        call2 = "-"+call.substring(2,6)+"-";
        call3 = call.substring(6);
        PHONE = call1+call2+call3;
    }
    String getNum(){return cn;}
    String getName(){return name;}
    String getMajor(){return major;}
    String getPHONE(){return PHONE;}
}