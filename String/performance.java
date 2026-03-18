//package String;

public class performance {
  public static void main(String[] args) {
    String series ="";
    for (int i = 0; i < 26; i++) {
        char ch =(char)('a'+i);
        System.out.print(ch);// it taking lots of memory like when we adding new char the previous is wasting like
    }                           // abc +d ---> abcd , abcd+e---> abcde 
                                    //that why we use String builder
  }  
}
