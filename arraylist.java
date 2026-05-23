import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        //operations 
        //1.add
        list.add(1);
        list.add(2);
        System.out.println(list);
        //2.get
        int atindex =list.get(0);
        System.out.println(atindex);
        //3.add in b/w 
        list.add(0, 0);
        System.out.println(list );
        //4.set element
        list.set(2, 0);
        System.out.println(list);
        //5.delete
        list.remove(2);
        System.out.println(list);
        //6.size
        int size =list.size();
        System.out.println(size);
        //7.iterate / loop
        for(int i=0;i<list.size();i++){
            System.out.printf(list.get(i)+" ");
        }
        //8.sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
