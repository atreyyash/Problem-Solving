import java.util.*;

public class Main{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list + " -> "+ list.size());
        
        //Add
        list.add(10);
        list.add(20);
        list.add(30);
        
        System.out.println(list + " -> "+ list.size());
        
        //Insert
        list.add(1, 1000);
        System.out.println(list + " -> "+ list.size());
        
        int val = list.get(1); //not list[1]
        System.out.println(list + " -> "+ list.size());

        list.set(1, 2000);  //not list[1] = 2000
        System.out.println(list + " -> "+ list.size());

        list.remove(1);
        System.out.println(list + " -> "+ list.size());
        

    }

}