package Java_Recursion;

public class Normal_Problems {
    static boolean checkPal(String str, int start, int end) {
        /*
        this function uses recursion to find if the given string is palindromic or not
         */
        if (start >= end) {
            return true;
        }
        return (str.charAt(start) == str.charAt(end) && checkPal(str, start+1, end-1));
    }

    static int cutRope(int n, int a, int b, int c){
        /*
        given a rope of length l=n cut the rope into max number of pieces each piece has a length of a or b or c

        if n = 5 and a=2,b=5,c=1
        the function should return 5 as this rope can cut into max 5 pieces of length c=1

        if n = 23 and a=12,b=9,c=11
        the function should return 2 as this rope can cut into max 2 pieces of length c=11 and a=12
         */

        if (n==0) return 0;
        if (n < 0) return -1;

        int res = Math.max(Math.max(cutRope(n-a,a,b,c), cutRope(n-b,a,b,c)), cutRope(n-c,a,b,c));

        if (res == -1) return -1;

        return res+1;
    }

    static void printSubStringCombination(String str, String curr, int n) {
        //This function takes a string str as argument and prints all possible substrings of str

        if (n == str.length()){
            System.out.println(curr);
            return;
        }

        printSubStringCombination(str, curr, n+1);
        printSubStringCombination(str, curr + str.charAt(n), n+1);
    }

    public static void main(String[] args) {
        String str = "abccxba";
        System.out.println(checkPal(str, 0, str.length()-1));

        System.out.println(cutRope(5,2,5,1));

        printSubStringCombination("abc"," ", 0);
    }
}
