package collectionslar;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        personel p=new personel();
        p.setIsim("Ali");
        p.setIdNum(12345);
        personel p1= new personel();
        p1.setIsim("Mehmet");
        p1.setIdNum(34567);
        System.out.println("ArrayList------------");
        ArrayList<personel> aList= new ArrayList() ;
        aList.add(p);
        aList.add(p1);
        System.out.println( aList);

        ArrayList<ogrenci> aList1= new ArrayList() ;
        ogrenci o=new ogrenci();
        o.setName("omer");
        o.setDers("java");
        aList1.add(o);
        System.out.println(aList1);
        System.out.println(aList1);

        System.out.println("LinkedList-------------");
        LinkedList <personel> linked=new LinkedList<>();
        linked.offer(p);
        linked.offer(p1);
        System.out.println(linked);

        System.out.println("HashSet----------------");
        Set<personel> hSet=new HashSet<>();
        hSet.add(p);
        hSet.add(p1);
        System.out.println(hSet);

        System.out.println("TreeSet------------");
        Set<String> tSet=new TreeSet<>();
        tSet.add("ali");
        tSet.add("veli");
        tSet.add("mehmet");
        tSet.add("osman");
        tSet.add("berk");
        System.out.println(tSet);

    }

}
