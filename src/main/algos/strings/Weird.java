package main.algos.strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Weird {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] characters = s.toCharArray();
        int count = 0;
        Set<Character> uniques = new HashSet<Character>();
        for(char c:characters){
            uniques.add(c);
        }
        if(uniques.size()<2){
            System.out.println("0");
        }else if(uniques.size()==2){
            for(int i = 0;i<s.length()-1;i++){
                if(s.charAt(i)!=s.charAt(i+1)){
                 break;   
                }else{
                 count++;
                }
            }
           System.out.println(s.length());
        }else{
        Iterator<Character> itr = uniques.iterator();
        Integer count1 = Integer.MIN_VALUE;
        String temp = "";
        while(itr.hasNext()){
            int count2 = 0;
            Object obj=itr.next();
            for(Character c:characters){
                if(c==obj){
                 temp = s.replaceAll(c.toString(),"");
                }
            }
            for(int i = 0;i<temp.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                 break;   
                }else{
                    count2++;
                }
            }
            if(count1<count2 && count2!=0){
                count1 = count2;
            }else{
              count1=0; 
            }
        }
            if(count1!=0){
            System.out.println(count1+1);
            }else{
            System.out.println(0);
            }
    }
}
}
