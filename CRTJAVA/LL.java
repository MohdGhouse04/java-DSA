import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
      LinkedList<String> list=new LinkedList<>();
      //1.add 
      list.addFirst("a");
      list.addFirst("is");
      list.addFirst("this");
      list.add("list");
      System.out.println(list);  
      //2.print like a list
      for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+"->");

      }
      System.out.println("null");
      //3.remove
      list.removeFirst();
      list.remove(0);
      System.out.println(list);

    }
}
