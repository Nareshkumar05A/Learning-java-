import java.util.*;
class Main
{
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"Naresh");
        map.put(2,"Kumar");
        map.put(3,"NK");
        System.out.println(map);
    }
}


/*import java.util.*;
class Main
{
import java.util.HashMap;
import java.util.Map;

Map<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<arr.length;i++)
        {
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
         }
}