import java.util.*;

public class Homework8 {
    public Map<String, String> ID_NUMBERS;

    Map<String, String> ID_NUMBERS(){
        Map<String, String> idnum = new HashMap<>();
        idnum.put("myId", "myPass");
        idnum.put("myId2", "myPass2");
        idnum.put("myId3", "myPass3");
        return idnum;
    }

    public void main(String[] args){
        this.ID_NUMBERS = ID_NUMBERS();
        Scanner sc = new Scanner(System.in);
        String id, num;
        Check check = new Check();

        while (true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            id = sc.nextLine();
            if(check.IdCheck(id, ID_NUMBERS) == false){continue;}

            System.out.print("password : ");
            num = sc.nextLine();
            if(check.NumCheck(num, id, ID_NUMBERS) == false){continue;}

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }

    }
}

class Check{
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