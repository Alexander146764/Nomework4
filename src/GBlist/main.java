package GBlist;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
//        Gblist<String> list = new GbArrayList<>();
//        System.out.println(list.isEmpty());
//        list.add("A").add("B").add("C").add("D");
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//        list.update("R",0);
//        System.out.println(list);

//        Gblist<Integer> list = new GbArrayList<Integer>().add(560).add(23).add(543);
//
//        System.out.println(list.remove(1));


        LinkedList<String> stringLinked = new LinkedList<>();
        stringLinked.addLast("abc");
        stringLinked.addFirst("cht");
        stringLinked.addFirst("ct");
        System.out.println(stringLinked.size());
        System.out.println(stringLinked.get(2));
    }

}
