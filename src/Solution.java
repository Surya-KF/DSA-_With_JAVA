import java.util.Scanner;
class Solution {
    public String mergeA(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<word1.length()|| i<word2.length();i++){
            if(i< word1.length()){
                result.append(word1.charAt(i));
            }

            if(i <word2.length()){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        Solution solution = new Solution();
        System.out.println(solution.mergeA(String s1, String s2));

        return0;

        sc.close();
    }
}