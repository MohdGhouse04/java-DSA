class bankaccount{
    int balanace;
    String Name;
    bankaccount(int balanace ,String Name){
        this.balanace=balanace;
        this.Name= Name;


    }
    void withdraw(int amount){
        if(amount < balanace){
            System.out.println("insufficent balance");
        }
        balanace = balanace -amount;
        System.out.println("you can withdraw "+amount+"only");
    }
    void deposit(int amount){
        if(amount < 0){
            System.out.println("you cant deposite less than 1 ");

        }
        balanace=balanace+  amount;
        System.out.println("deposited"+amount);
    }
    int display(){
        System.out.println(Name);
        return balanace;
    }
}
public class banking {
    public static void main(String[] args) {
        bankaccount b =new bankaccount(1000, "mohd ghouse");
        b.deposit(1000);
        b.display();
        b.withdraw(500);
        b.display();
    }
}
