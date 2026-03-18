public class method_parameters {
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static String name(String nam) {
        String meassage = nam;
        return meassage;
    }

    public static void main(String[] args) {
        int ans = sum(20, 30);
        System.out.println(ans);
        String call=name("Mohd Ghouse");
        System.out.println(call);
    }
}
