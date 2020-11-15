package Homework2_3;


import java.util.*;

public class PhoneBook {

   private HashMap< String , Set<Long>> phoneBook = new HashMap<>();

   public void add(String name, Long phone){
       Set<Long> tell = phoneBook.getOrDefault(name, new HashSet<>());
       tell.add(phone);
       phoneBook.put(name, tell);
   }
   public void add (String name, Long ... phones){
       Set<Long> tell = phoneBook.getOrDefault(name, new HashSet<>());
       tell.addAll(Arrays.asList(phones));
       phoneBook.put(name,tell);
   }
   public Set<Long> get (String name) {
       return phoneBook.get(name);
   }
}
