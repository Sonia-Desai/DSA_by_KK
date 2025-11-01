import java.util.HashMap;
import java.util.HashSet;

public class Collection {
    static void main(String[] args) {
        HashMap<Integer,String> hs = new HashMap<Integer,String>();
        hs.put(1,"Soniya");
        hs.put(2,"Mahantesh");
       // hs.put(9,"kashi");
        hs.put(3,"Revati");
        hs.put(4,"mahendra");
        hs.put(5,"Suchitra");

        for(int num : hs.keySet()){
            if(num%2==0){
                System.out.println(num);
            }

        }
        System.out.println();

        for(String str : hs.values()){
            if(str.equals("a"))
            System.out.println(str);
        }

        for(String str : hs.values()){
            if(  str.startsWith("m")){
                System.out.println(str);
            }

        }
    }
}



