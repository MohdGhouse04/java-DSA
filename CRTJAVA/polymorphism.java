

class amount{
    int cost;
    Cost(int cost){
        this.cost =cost;
    }
    void payment(){
        System.out.println(cost+"your payment is underprocess");
    }
}
class cash extends amount{
    Cash(int a){
        super(cost);
    }
    void payment(){
        super.payment();
        System.out.println("you paid using cash mode");
    }
}
class upi extends amount{
    upi(int a){
        super(cost);
    }
    void payment(){
        super.payment();
        System.out.println("you paid using upi");
    }
}
public class polymorphism {
    public static void main(String[] args) {

        cash c = new cash();
        c.payment();
        upi u = new upi();
        u.payment();
        amount a = new amount();
        a.payment();
    }
}
