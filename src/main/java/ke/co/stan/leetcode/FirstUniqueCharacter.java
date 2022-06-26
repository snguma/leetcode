
package ke.co.stan.leetcode;

class FirstUniqueCharacter {

    public static void main(String[] args) {
        String input = "stanleys";
        System.out.println(FirstUniqueCharacter.solution(input));

    }

    private static int solution(String input) {
        for (int i = 0; i < input.length(); i++) {
            // if the character is not repeating then the first index and last index will be equal
            if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))) 
                return i;
        }
        return -1;
    }
}