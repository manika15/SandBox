package main.algos.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        String s = "[{}[]()]";
        System.out.println("Enter a string of paranthesis: ");
        String input = scan.next();
        System.out.println("Is input a valid paranthesis like: " + s + ": " +isValidParanthesis(input));
        scan.close();
    }

    private static boolean isValidParanthesis(String s) {

Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.keySet().contains(c)) {
                stack.push(c);
            } else if (map.values().contains(c)) {
                if (!stack.isEmpty() && map.get(stack.peek()) == c) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}