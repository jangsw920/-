import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Homework9 {
    public static void main(String[] args) {
        String id, num;
        Equal equal = new Equal();
        Scanner sc = new Scanner(System.in);
        Map<String, String> IdNum = new HashMap<>();

        try {
            Scanner fs = new Scanner(new File("C:\\Users\\jangs\\IdeaProjects\\Hello\\src\\db.txt"));
            while (fs.hasNextLine()) {
                String line = fs.nextLine();
                IdNum.put(line.substring(0, 5).trim(), line.substring(5).trim());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }



        while (true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            id = sc.nextLine();
            if(equal.IdCheck(id, IdNum) == false){continue;}

            System.out.print("password : ");
            num = sc.nextLine();
            if(equal.NumCheck(num, id, IdNum) == false){continue;}

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }
    }
}

class Equal{
    private HashMap<String, String> IdNum;

    boolean IdCheck(String id, Map<String, String> ID_NUMBERS){
        this.IdNum = (HashMap<String, String>) ID_NUMBERS;
        for(Map.Entry<String, String>IdNum : this.IdNum.entrySet()){
            if(IdNum.getKey().equals(id)){
                return true;
            }
        }
        System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
        return false;
    }

    boolean NumCheck(String num, String id, Map<String, String> ID_NUMBERS){
        this.IdNum = (HashMap<String, String>) ID_NUMBERS;
        Iterator<String> it = this.IdNum.keySet().iterator();
        while(it.hasNext()){
            if(it.next().equals(id)){
                if(Objects.equals(num, this.IdNum.get(id))){
                    return true;
                }
            }
        }
        System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요\n");
        return false;
    }
}