package main.algos.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            String s = in.next();
	            System.out.println(checkIfBalanced(s));
	        }
	        in.close();
	    }
	    
	    private static String checkIfBalanced(String str){
	        Stack<Character> stack = new Stack<Character>();
	        Map<Character,Character> map = new HashMap<Character,Character>();
	        map.put('(',')');
	        map.put('{','}');
	        map.put('[',']');
	        
	        for(int i =0;i<str.length();i++){
	            Character c = str.charAt(i);
	            if(map.keySet().contains(c)){
	                stack.push(c);
	            }else if(map.values().contains(c)){
	                if(!stack.isEmpty() && map.get(stack.peek()) == c){
	                    stack.pop();
	                }else{
	                    return "NO";
	                }
	            }
	        }
	        if(stack.isEmpty()){
	            return "YES";
	        }else{
	            return "NO";
	        }
	    }
}
