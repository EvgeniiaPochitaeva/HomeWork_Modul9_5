package HomeWork_Modul9_5;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<Integer, String>();
        myHashMap.put(1,"Black");
        myHashMap.put(2,"White");
        myHashMap.put(3,"Green");

        System.out.println(myHashMap.size());

        System.out.println(myHashMap.get(3));
         myHashMap.remove(1);

         myHashMap.clear();


    }


}
