class book{
    String title;
    String nameOfAuthor;
    double price;
    public book(){
        this.title="";
        this.nameOfAuthor="";
        this.price=0.0;

    }
    public book(String title , String nameOfAuthor){
        this.title=title;
        this.nameOfAuthor=nameOfAuthor;
    }
    public book(String title , String nameOfAuthor , double price){
        this.title=title;
        this.nameOfAuthor=nameOfAuthor;
        this.price=price;
    }
    void display(){
        System.out.println("title :  "  +title+" name of author :"+nameOfAuthor+"  price :"+price);
    }
}
public class constructorOverloading {
    public static void main(String[] args) {
        book b1 = new book();
        b1.display();
        book b2 = new book("the wings of fire","ABJAK");
        b2.display();
        book b3 =new book("the wings of fire ", "APJAK",500);
        b3.display();

    }
}
