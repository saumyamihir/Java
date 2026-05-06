
// ArrayList And Set

// Now we cover HashMap And Deque

// HashMap -> It is not part of collections.

// HashMap -> Class for this we have interface Map.

// Map(Interface) -------- HashMap(Class)

import java.util.*;

class Main{
    public static void main(String[] args) {

        Map<Integer,String>mp = new HashMap<>();
        // HashMap<Integer,String>mp=new HashMap<>();  we can write any of these .

        // To insert the element in HashMap
        // we have put method -> put(key,value) ->
        mp.put(101, "Sita");
        mp.put(102, "Ram");
        mp.put(103, "Krishna");
        mp.put(104, "Hanuman");
        System.out.println(mp);

        // to access value of key ->
        // mp.get(key);
        // mp.get(101) ->Sita
        // mp.get(102) ->Ram
        // mp.get(103) ->Krishna

        System.out.println(mp.get(101));
        System.out.println(mp.get(102));
        System.out.println(mp.get(103));
        System.out.println(mp.get(104));

        // remove or delete the element from HashMap
        // remove(pass the key)
        // remove(101)
        mp.remove(101); // it will delete whole entry of 101 key from map
        System.out.println(mp);

    }
}


