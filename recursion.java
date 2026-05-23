import java.util.HashSet;

public class recursion {
    public static void printnum(int i,int n ,int sum){
        // if(n == 0) return ;
        // System.out.println(n);
        // printnum(n-1);
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printnum(i+1, n, sum);
    }
    public static int fact(int n){
        if(n == 1 || n == 0) return 1;
        int facto=fact(n-1);
        int fac_to=n*facto;
        return fac_to;
    }
    public static void fib(int a, int b ,int n){
        if(n ==0) return;
        int c = a+b;
        System.out.println(c);
        fib(b, c,n-1);
    }
    public static int calpow(int x , int n){
        if(n == 0) return 1;
        if(x ==0 )return 0;
        int xpow1 = calpow(x, n-1);
        int xpow2=x*xpow1;
        return xpow2;
    }
    public static int calpowlogn(int x , int n){
        if(n == 0) return 1;
        if(x ==0 )return 0;
        if(n%2==0) return calpow(x, n/2)*calpow(x, n/2);//if n is even 
        else return calpow(x, n/2)*calpow(x, n/2)*x;//if n is odd
    }
    public static void towerOfhanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk "+n+"from"+src+"to"+dest);
            return;
        }
        towerOfhanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+"from"+src+"to"+dest);
        towerOfhanoi(n-1, helper, src, dest);
    }
    public static void reverseString(String str,int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, index-1);
    }
    public static int first =-1;
    public static int last=-1;
    public static void findocc(String str1,int idx,char element){
        if(idx == str1.length()){
            System.out.println("first"+first);
            System.out.println("last"+last);
            return;
        }
        char currChar=str1.charAt(idx);
        if(currChar == element){
            if(first ==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        findocc(str1, idx+1, element);
    }
    public static boolean sorted(int arr [],int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] < arr[index+1]){
            return sorted(arr, index+1);
        }else{
            return false;
        }
    }
    public static void moveallxtoend(String str, int idx, int count,String newstr){
        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(currchar == 'x'){
            count++;
            moveallxtoend(str, idx+1, count, newstr);
        }else{
            newstr += currchar;
            moveallxtoend(str, idx+1, count, newstr);
        }
        System.out.println(newstr);
    }
    public static boolean [] map=new boolean[26];
    public static void removeDuplicate(String str,int index,String newstr){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar=str.charAt(index);
        if(map[currChar-'a'] == true){
            removeDuplicate(str, index+1, newstr);
        }else{
            newstr += currChar;
            map[currChar-'a'] = true;
            removeDuplicate(str, index+1, newstr);

        }
    }
    public static int subsequences(String str,int idx,String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
            return 1;
        }
        char currChar=str.charAt(idx);
        int left=subsequences(str, idx+1, newstr+currChar);
        int right=subsequences(str, idx+1, newstr);
        return left+right;
    }
    public static int uniquesubsequences(String str,int idx,String newstr,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newstr)) return 0;
            else{
                System.out.println(newstr);
                set.add(newstr);
                return 1;
        }
        }
        char currChar=str.charAt(idx);
        int left=uniquesubsequences(str, idx+1, newstr+currChar,set);
        int right=uniquesubsequences(str, idx+1, newstr,set);
        return left+right;
    }
    public static String [] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcombination(String str,int idx,String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currchar=str.charAt(idx);
        String mapping =keypad[currchar-'0'];
        for(int i=0;i<mapping.length();i++){
            printcombination(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        printnum(1, 10, 0);
        int ans=fact(5);
        System.out.println(ans);
        int a =0,b=1;
        int n=7;
        fib(a, b, n-2);
        int ans1=calpow(2, 5);
        System.out.println(ans1);
        int ans2=calpowlogn(2, 5);
        System.out.println(ans2);
        towerOfhanoi(3, "s", "h", "d");
        String str="abcd";

        reverseString(str, str.length()-1);
        String str1="aaaaabddfhjafgluaojieh";
        findocc(str1, 0,'a');
        int [] arr={1,2,3,4,5};
        System.out.println(sorted(arr, 0));
        String str2="xawfwugxxxxwrksfhwl";
        moveallxtoend(str2, 0, 0, "");
        String str3="ekfasgaaaaaaodsv";
        removeDuplicate(str3, 0, "");
        String str4="abc";
        int count =subsequences(str4, 0, "");
        System.out.println("count="+count);
        HashSet <String> set=new HashSet<>();
        String str5="aaa";
        int count1=uniquesubsequences(str5, 0, "", set);
        System.out.println(count1);
        String str6="4";
        printcombination(str6, 0, "");
        // System.out.println();


    }
}
